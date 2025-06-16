package com.mrsalty.claygolems.entity.client;

import com.mrsalty.claygolems.entity.custom.SmallClayGolemEntity;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SmallClayGolemModel<T extends SmallClayGolemEntity> extends SinglePartEntityModel<T> {
  private final ModelPart SmallClayGolem;
  private final ModelPart Head;

  public SmallClayGolemModel(ModelPart root) {
    this.SmallClayGolem = root.getChild("SmallClayGolem");
    this.Head = SmallClayGolem.getChild("Torso").getChild("Head");
  }

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData modelPartData = modelData.getRoot();
    ModelPartData SmallClayGolem =
        modelPartData.addChild(
            "SmallClayGolem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

    ModelPartData Torso =
        SmallClayGolem.addChild(
            "Torso",
            ModelPartBuilder.create()
                .uv(0, 0)
                .cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)),
            ModelTransform.pivot(0.0F, -2.5F, 0.0F));

    ModelPartData Head =
        Torso.addChild(
            "Head",
            ModelPartBuilder.create()
                .uv(0, 6)
                .cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)),
            ModelTransform.pivot(0.0F, -1.5F, 0.0F));

    ModelPartData LeftArm =
        Torso.addChild(
            "LeftArm",
            ModelPartBuilder.create()
                .uv(0, 9)
                .cuboid(0.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)),
            ModelTransform.pivot(1.5F, -1.0F, 0.0F));

    ModelPartData RightArm =
        Torso.addChild(
            "RightArm",
            ModelPartBuilder.create()
                .uv(8, 6)
                .cuboid(-1.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)),
            ModelTransform.pivot(-1.5F, -1.0F, 0.0F));

    ModelPartData LeftLeg =
        Torso.addChild(
            "LeftLeg",
            ModelPartBuilder.create()
                .uv(8, 10)
                .cuboid(-0.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)),
            ModelTransform.pivot(1.0F, 1.0F, 0.0F));

    ModelPartData RightLeg =
        Torso.addChild(
            "RightLeg",
            ModelPartBuilder.create()
                .uv(4, 9)
                .cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)),
            ModelTransform.pivot(-1.0F, 1.0F, 0.0F));
    return TexturedModelData.of(modelData, 16, 16);
  }

  @Override
  public void setAngles(
      SmallClayGolemEntity entity,
      float limbSwing,
      float limbSwingAmount,
      float ageInTicks,
      float netHeadYaw,
      float headPitch) {}

  @Override
  public void render(
      MatrixStack matrices,
      VertexConsumer vertexConsumer,
      int light,
      int overlay,
      float red,
      float green,
      float blue,
      float alpha) {
    SmallClayGolem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
  }

  @Override
  public ModelPart getPart() {
    return SmallClayGolem;
  }
}
