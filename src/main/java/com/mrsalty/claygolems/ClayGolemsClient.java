package com.mrsalty.claygolems;

import com.mrsalty.claygolems.entity.ModEntities;
import com.mrsalty.claygolems.entity.client.ModModelLayers;
import com.mrsalty.claygolems.entity.client.SmallClayGolemModel;
import com.mrsalty.claygolems.entity.client.SmallClayGolemRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ClayGolemsClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    EntityRendererRegistry.register(ModEntities.SMALL_CLAY_GOLEM, SmallClayGolemRenderer::new);
    EntityModelLayerRegistry.registerModelLayer(
        ModModelLayers.SMALL_CLAY_GOLEM, SmallClayGolemModel::getTexturedModelData);
  }
}
