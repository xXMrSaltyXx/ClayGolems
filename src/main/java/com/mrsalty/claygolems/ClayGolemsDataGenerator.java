package com.mrsalty.claygolems;

import com.mrsalty.claygolems.datagen.ModBlockTagProvider;
import com.mrsalty.claygolems.datagen.ModItemTagProvider;
import com.mrsalty.claygolems.datagen.ModLootTableProvider;
import com.mrsalty.claygolems.datagen.ModModelProvider;
import com.mrsalty.claygolems.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ClayGolemsDataGenerator implements DataGeneratorEntrypoint {

  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

    pack.addProvider(ModBlockTagProvider::new);
    pack.addProvider(ModItemTagProvider::new);
    pack.addProvider(ModLootTableProvider::new);
    pack.addProvider(ModModelProvider::new);
    pack.addProvider(ModRecipeProvider::new);
  }
}
