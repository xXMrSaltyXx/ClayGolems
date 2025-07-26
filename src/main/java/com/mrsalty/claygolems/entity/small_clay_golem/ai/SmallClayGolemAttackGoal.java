package com.mrsalty.claygolems.entity.small_clay_golem.ai;

import com.mrsalty.claygolems.entity.small_clay_golem.animation.SmallClayGolemAnimations;
import com.mrsalty.claygolems.entity.small_clay_golem.SmallClayGolemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Hand;

public class SmallClayGolemAttackGoal extends MeleeAttackGoal {

  private final SmallClayGolemEntity ENTITY;
  private final int ATTACK_DELAY = 14;
  private final float ANIMATION_LENGTH = SmallClayGolemAnimations.attack.lengthInSeconds();
  private int ticksUntilNextAttack = 0;
  private boolean shouldCountTillNextAttack = false;
  private boolean animationRunning = false;

  public SmallClayGolemAttackGoal(PathAwareEntity mob, double speed, boolean pauseWhenMobIdle) {
    super(mob, speed, pauseWhenMobIdle);
    ENTITY = (SmallClayGolemEntity) mob;
  }

  @Override
  public void start() {
    super.start();
    ticksUntilNextAttack = ATTACK_DELAY;
  }

  @Override
  protected void attack(LivingEntity target, double squaredDistance) {
    if (this.isEnemyInRange(target)) {
      shouldCountTillNextAttack = true;

      if (isTimeToStartAttackAnimation() && !animationRunning) {
        ENTITY.setAttacking(true);
        animationRunning = true;
      }

      if (isTimeToAttack() && animationRunning) {
        this.mob.getLookControl().lookAt(target);
        performAttack(target);
      }
    } else {
      if (animationRunning) {
        shouldCountTillNextAttack = true;

        if (isTimeToAttack()) {
          this.mob.getLookControl().lookAt(target);
          performAttack(target);
        }
        if (isStartOfAttackAnimation()) {
          animationRunning = false;
        }
      } else {
        shouldCountTillNextAttack = false;
        ENTITY.attackAnimationCooldown = 0;
        resetAttackCooldown();
        ENTITY.setAttacking(false);
      }
    }
  }

  private boolean isEnemyInRange(LivingEntity target) {
    return this.ENTITY.distanceTo(target) <= SmallClayGolemEntity.ATTACK_RANGE;
  }

  protected void resetAttackCooldown() {
    ticksUntilNextAttack = this.getTickCount((int) (20 * ANIMATION_LENGTH));
  }

  protected boolean isStartOfAttackAnimation() {
    return ticksUntilNextAttack == ATTACK_DELAY;
  }

  protected boolean isTimeToStartAttackAnimation() {
    return ticksUntilNextAttack <= ATTACK_DELAY;
  }

  protected boolean isTimeToAttack() {
    return ticksUntilNextAttack <= 0;
  }

  protected void performAttack(LivingEntity target) {
    this.mob.swingHand(Hand.MAIN_HAND);

    if (isEnemyInRange(target)) {
      this.ENTITY.tryAttack(target);
    }
    resetAttackCooldown();
  }

  @Override
  public void tick() {
    super.tick();
    if (shouldCountTillNextAttack) {
      ticksUntilNextAttack = Math.max(ticksUntilNextAttack - 1, 0);
    }
  }

  @Override
  public void stop() {
    animationRunning = false;
    ENTITY.setAttacking(false);
    super.stop();
  }
}
