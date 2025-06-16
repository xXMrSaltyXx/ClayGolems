package com.mrsalty.claygolems.entity.client;

import com.mrsalty.claygolems.ClayGolems;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
  public static final EntityModelLayer SMALL_CLAY_GOLEM =
      new EntityModelLayer(new Identifier(ClayGolems.MOD_ID, "small_clay_golem"), "main");
}
