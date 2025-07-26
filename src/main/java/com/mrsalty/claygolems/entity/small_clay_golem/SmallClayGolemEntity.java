package com.mrsalty.claygolems.entity.small_clay_golem;

import com.mrsalty.claygolems.entity.ModEntities;
import com.mrsalty.claygolems.entity.small_clay_golem.ai.SmallClayGolemAttackGoal;
import com.mrsalty.claygolems.entity.small_clay_golem.animation.SmallClayGolemAnimations;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmallClayGolemEntity extends TameableEntity {

  private static final TrackedData<Boolean> ATTACKING =
      DataTracker.registerData(SmallClayGolemEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
  public static final float ATTACK_RANGE = 2.0f;
  private static final Logger log = LoggerFactory.getLogger(SmallClayGolemEntity.class);

  public final AnimationState idleAnimationState = new AnimationState();
  private int idleAnimationCooldown = 0;

  public final AnimationState attackAnimationState = new AnimationState();
  public int attackAnimationCooldown = 0;

  public final AnimationState sitSwayAnimationState = new AnimationState();
  public int sitSwayAnimationCooldown = 0;

  public final AnimationState sitWipAnimationState = new AnimationState();
  public int sitWipAnimationCooldown = 0;

  public final AnimationState sitFlushAnimationState = new AnimationState();
  public int sitFlushAnimationCooldown = 0;

  public SmallClayGolemEntity(EntityType<? extends TameableEntity> entityType, World world) {
    super(entityType, world);
  }

  private enum SitAnimation {
    NONE,
    SIT_SWAY,
    SIT_WIP,
    SIT_FLUSH
  }

  private SitAnimation currentSitAnimation = SitAnimation.SIT_SWAY;

  private void updateAnimationStates() {
    if (this.idleAnimationCooldown <= 0) {
      this.idleAnimationCooldown = this.random.nextInt(40) + 80;
      this.idleAnimationState.start(this.age);
    } else {
      this.idleAnimationCooldown--;
    }

    updateSitAnimationStates();

    if (this.isAttacking() && this.attackAnimationCooldown <= 0) {
      this.attackAnimationCooldown = (int) (20 * SmallClayGolemAnimations.attack.lengthInSeconds());
      this.attackAnimationState.start(this.age);
    } else if (this.attackAnimationCooldown > 0) {
      this.attackAnimationCooldown--;
    }

    if (!this.isAttacking()) {
      this.attackAnimationState.stop();
    }

  }

  private void updateSitAnimationStates() {
    if (this.isSitting() && this.sitSwayAnimationCooldown <= 0 && this.sitWipAnimationCooldown <= 0
        && sitFlushAnimationCooldown <= 0) {
      int animationPick = currentSitAnimation == SitAnimation.NONE ? this.random.nextInt(3) + 1
          : currentSitAnimation.ordinal();
      switch (animationPick) {
        case 1:
          this.currentSitAnimation = SitAnimation.SIT_SWAY;
          this.sitSwayAnimationCooldown = (int) (SmallClayGolemAnimations.sit_sway.lengthInSeconds()
              * 20);
          this.sitSwayAnimationState.start(this.age);
          break;
        case 2:
          this.currentSitAnimation = SitAnimation.SIT_WIP;
          this.sitWipAnimationCooldown = (int) (SmallClayGolemAnimations.sit_wip.lengthInSeconds()
              * 20);
          this.sitWipAnimationState.start(this.age);
          break;
        case 3:
          this.currentSitAnimation = SitAnimation.SIT_FLUSH;
          this.sitFlushAnimationCooldown = (int) (
              SmallClayGolemAnimations.sit_flush.lengthInSeconds() * 20);
          this.sitFlushAnimationState.start(this.age);
          break;
      }
    } else {
      if (this.sitSwayAnimationCooldown > 0) {
        this.sitSwayAnimationCooldown--;
      }
      if (this.sitWipAnimationCooldown > 0) {
        this.sitWipAnimationCooldown--;
      }
      if (this.sitFlushAnimationCooldown > 0) {
        this.sitFlushAnimationCooldown--;
      }
    }

    if (!this.isSitting()) {
      this.currentSitAnimation = SitAnimation.NONE;
      this.sitSwayAnimationState.stop();
      this.sitSwayAnimationCooldown = 0;
      this.sitWipAnimationState.stop();
      this.sitWipAnimationCooldown = 0;
      this.sitFlushAnimationState.stop();
      this.sitFlushAnimationCooldown = 0;
    }
  }

  public void setAttacking(boolean attacking) {
    this.dataTracker.set(ATTACKING, attacking);
  }

  public boolean isAttacking() {
    return this.dataTracker.get(ATTACKING);
  }

  @Override
  protected void initDataTracker() {
    super.initDataTracker();
    this.dataTracker.startTracking(ATTACKING, false);
  }

  @Override
  protected void updateLimbs(float posDelta) {
    float f;
    if (this.getPose() == EntityPose.STANDING) {
      f = Math.min(posDelta * 6.0F, 1.0F);
    } else {
      f = 0.0F;
    }

    this.limbAnimator.updateLimbs(f, 0.2F);
  }

  @Override
  public void tick() {
    super.tick();
    if (this.getWorld().isClient()) {
      updateAnimationStates();
    }
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new SitGoal(this));
    this.goalSelector.add(2, new SmallClayGolemAttackGoal(this, 1D, true));
    this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
    this.goalSelector.add(4, new WanderAroundFarGoal(this, 1.0f));
    this.goalSelector.add(5, new LookAroundGoal(this));

    this.targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
  }

  public static DefaultAttributeContainer.Builder createSmallClayGolemAttributes() {
    return MobEntity.createMobAttributes()
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25f)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0);
  }

  @Override
  public ActionResult interactMob(PlayerEntity player, Hand hand) {
    ActionResult actionResult = super.interactMob(player, hand);

    if (!actionResult.isAccepted()) {
      this.setTamed(true);
      boolean sitCache = this.isSitting();
      this.setSitting(!this.isSitting());
      this.jumping = false;
      this.navigation.stop();
      this.setTarget(null);
      return ActionResult.SUCCESS;
    }

    return actionResult;
  }

  @Override
  public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.SMALL_CLAY_GOLEM.create(world);
  }

  @Override
  protected @Nullable SoundEvent getAmbientSound() {
    return SoundEvents.ENTITY_SHULKER_AMBIENT;
  }

  @Override
  protected @Nullable SoundEvent getHurtSound(DamageSource source) {
    return SoundEvents.ENTITY_SHULKER_HURT_CLOSED;
  }

  @Override
  protected @Nullable SoundEvent getDeathSound() {
    return SoundEvents.ENTITY_SHULKER_DEATH;
  }

  @Override
  public EntityView method_48926() {
    return this.getWorld();
  }
}
