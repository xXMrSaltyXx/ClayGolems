package com.mrsalty.claygolems;

import com.mrsalty.claygolems.entity.ModEntities;
import com.mrsalty.claygolems.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClayGolems implements ModInitializer {

  public static final String MOD_ID = "claygolems";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ModEntities.registerModEntityAttributes();
    ModItems.registerModItems();
  }
}
