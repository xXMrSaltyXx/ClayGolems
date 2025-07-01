package com.mrsalty.claygolems.entity.ai;

import com.mrsalty.claygolems.entity.custom.SmallClayGolemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Hand;

public class SmallClayGolemAttackGoal extends MeleeAttackGoal {
  private final SmallClayGolemEntity entity;
  private int attackDelay = 14;
  private final int tickBetweenAttacks = 35;
  private int ticksUntilNextAttack = 14;
  private boolean shouldCountTillNextAttack = false;

  public SmallClayGolemAttackGoal(PathAwareEntity mob, double speed, boolean pauseWhenMobIdle) {
    super(mob, speed, pauseWhenMobIdle);
    entity = (SmallClayGolemEntity) mob;
  }

  @Override
  public void start() {
    super.start();
    attackDelay = 14;
    ticksUntilNextAttack = 14;
  }

  @Override
  protected void attack(LivingEntity target, double squaredDistance) {
    if (this.isEnemyInRange(target)) {
      shouldCountTillNextAttack = true;

      if (this.isTimeToStartAttackAnimation()) {
        entity.setAttacking(true);
      }

      if (this.isTimeToAttack()) {
        this.mob.getLookControl().lookAt(target);
        performAttack(target);
      }
    } else {
      resetAttackCooldown();
      shouldCountTillNextAttack = false;
      entity.setAttacking(false);
      entity.attackAnimationCooldown = 0;
    }
  }

  private boolean isEnemyInRange(LivingEntity target) {
    return this.entity.distanceTo(target) <= SmallClayGolemEntity.ATTACK_RANGE;
  }

  protected void resetAttackCooldown() {
    ticksUntilNextAttack = getTickCount(attackDelay * 2);
  }

  protected boolean isTimeToStartAttackAnimation() {
    return ticksUntilNextAttack <= attackDelay;
  }

  protected boolean isTimeToAttack() {
    return ticksUntilNextAttack <= 0;
  }

  protected void performAttack(LivingEntity target) {
    resetAttackCooldown();
    this.mob.swingHand(Hand.MAIN_HAND);
    this.entity.tryAttack(target);
  }

  @Override
  public void tick() {
    super.tick();
    if (shouldCountTillNextAttack) {
      ticksUntilNextAttack = Math.max(--ticksUntilNextAttack, 0);
    }
  }

  @Override
  public void stop() {
    entity.setAttacking(false);
    super.stop();
  }
}
