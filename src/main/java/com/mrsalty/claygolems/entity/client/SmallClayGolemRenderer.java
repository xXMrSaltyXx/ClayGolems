package com.mrsalty.claygolems.entity.client;

import com.mrsalty.claygolems.ClayGolems;
import com.mrsalty.claygolems.entity.custom.SmallClayGolemEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SmallClayGolemRenderer
    extends MobEntityRenderer<SmallClayGolemEntity, SmallClayGolemModel<SmallClayGolemEntity>> {
  private static final Identifier TEXTURES =
      new Identifier(ClayGolems.MOD_ID, "textures/entity/small_clay_golem.png");

  public SmallClayGolemRenderer(Context context) {
    super(context, new SmallClayGolemModel<>(context.getPart(ModModelLayers.SMALL_CLAY_GOLEM)), 1F);
  }

  @Override
  public Identifier getTexture(SmallClayGolemEntity entity) {
    return TEXTURES;
  }

  @Override
  public void render(
      SmallClayGolemEntity mobEntity,
      float f,
      float g,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int i) {

    matrixStack.scale(1F, 1F, 1F);

    super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
  }
}
