package com.mrsalty.claygolems.entity;

import com.mrsalty.claygolems.ClayGolems;
import com.mrsalty.claygolems.entity.custom.SmallClayGolemEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
  public static final EntityType<SmallClayGolemEntity> SMALL_CLAY_GOLEM =
      Registry.register(
          Registries.ENTITY_TYPE,
          new Identifier(ClayGolems.MOD_ID, "small_clay_golem"),
          FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SmallClayGolemEntity::new)
              .dimensions(EntityDimensions.fixed(0.6F, 0.6F))
              .build());

  public static void registerModEntityAttributes() {
    FabricDefaultAttributeRegistry.register(
        SMALL_CLAY_GOLEM, SmallClayGolemEntity.createSmallClayGolemAttributes());
  }
}
