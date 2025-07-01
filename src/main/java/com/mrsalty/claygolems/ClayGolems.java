package com.mrsalty.claygolems;

import com.mrsalty.claygolems.entity.ModEntities;
import com.mrsalty.claygolems.entity.custom.SmallClayGolemEntity;
import com.mrsalty.claygolems.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroups;

public class ClayGolems implements ModInitializer {
  public static final String MOD_ID = "claygolems";

  @Override
  public void onInitialize() {
    ModEntities.registerModEntityAttributes();
    ModItems.registerModItems();
  }
}
