package com.mrsalty.claygolems.entity.custom;

import com.mrsalty.claygolems.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SmallClayGolemEntity extends AnimalEntity {

  public SmallClayGolemEntity(EntityType<? extends AnimalEntity> entityType, World world) {
    super(entityType, world);
  }

  @Override
  protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new WanderAroundFarGoal(this, 10));
    this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
    this.goalSelector.add(3, new LookAroundGoal(this));
  }

  public static DefaultAttributeContainer.Builder createSmallClayGolemAttributes() {
    return AnimalEntity.createMobAttributes()
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25f)
        .add(net.minecraft.entity.attribute.EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
  }

  @Override
  public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.SMALL_CLAY_GOLEM.create(world);
  }
}
