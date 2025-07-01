package com.mrsalty.claygolems.item;

import com.mrsalty.claygolems.ClayGolems;
import com.mrsalty.claygolems.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item CLAY_GOLEM_SPAWN_EGG =
      registerItem(
          "small_clay_golem_spawn_egg",
          new SpawnEggItem(
              ModEntities.SMALL_CLAY_GOLEM, 0x8c5740, 0x56342a, new FabricItemSettings()));

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(ClayGolems.MOD_ID, name), item);
  }

  public static void registerModItems() {
    // opt. LOGGER

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS)
        .register(
            entries -> {
              entries.add(ModItems.CLAY_GOLEM_SPAWN_EGG);
            });
  }
}
