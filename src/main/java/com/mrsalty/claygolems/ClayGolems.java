package com.mrsalty.claygolems;

import com.mrsalty.claygolems.entity.ModEntities;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ClayGolems implements ModInitializer {
  public static final String MOD_ID = "claygolems";

  @Override
  public void onInitialize() {
    ModEntities.registerModEntityAttributes();
  }
}
