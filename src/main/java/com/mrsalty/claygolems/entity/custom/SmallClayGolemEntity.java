package com.mrsalty.claygolems.entity.custom;

import com.mrsalty.claygolems.entity.ModEntities;
import com.mrsalty.claygolems.entity.ai.SmallClayGolemAttackGoal;
import com.mrsalty.claygolems.entity.animation.SmallClayGolemAnimations;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SmallClayGolemEntity extends AnimalEntity {
  private static final TrackedData<Boolean> ATTACKING =
      DataTracker.registerData(SmallClayGolemEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
  public static final float ATTACK_RANGE = 2.0f;

  public final AnimationState idleAnimationState = new AnimationState();
  private int idleAnimationCooldown = 0;

  public final AnimationState attackAnimationState = new AnimationState();
  public int attackAnimationCooldown = 0;

  public SmallClayGolemEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  private void setupAnimationStates() {
    if (this.idleAnimationCooldown <= 0) {
      this.idleAnimationCooldown = this.random.nextInt(40) + 80;
      this.idleAnimationState.start(this.age);
    } else {
      this.idleAnimationCooldown--;
    }

    if (this.isAttacking() && this.attackAnimationCooldown <= 0) {
      this.attackAnimationCooldown = (int) (20 * SmallClayGolemAnimations.ATTACK.lengthInSeconds());
      this.attackAnimationState.start(this.age);
    } else if (this.attackAnimationCooldown > 0) {
      this.attackAnimationCooldown--;
    }

    if (!this.isAttacking()) {
      this.attackAnimationState.stop();
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
      setupAnimationStates();
    }
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new SmallClayGolemAttackGoal(this, 1D, true));
    this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0f));
    this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
    this.goalSelector.add(4, new LookAroundGoal(this));

    this.targetSelector.add(1, new RevengeGoal(this));
  }

  public static DefaultAttributeContainer.Builder createSmallClayGolemAttributes() {
    return MobEntity.createMobAttributes()
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25f)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
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
}
