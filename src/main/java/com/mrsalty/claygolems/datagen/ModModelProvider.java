package com.mrsalty.claygolems.datagen;

import com.mrsalty.claygolems.item.ModItems;
import java.util.Optional;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

  public ModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(
        ModItems.CLAY_GOLEM_SPAWN_EGG,
        new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}
}
