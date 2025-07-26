package com.mrsalty.claygolems.entity.small_clay_golem.client;

import com.mrsalty.claygolems.entity.small_clay_golem.animation.SmallClayGolemAnimations;
import com.mrsalty.claygolems.entity.small_clay_golem.SmallClayGolemEntity;
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
import net.minecraft.util.math.MathHelper;

public class SmallClayGolemModel<T extends SmallClayGolemEntity> extends SinglePartEntityModel<T> {

  private final ModelPart smallclaygolem;
  private final ModelPart head;

  public SmallClayGolemModel(ModelPart root) {
    this.smallclaygolem = root.getChild("SmallClayGolem");
    this.head = smallclaygolem.getChild("Torso").getChild("Head");
  }

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData modelPartData = modelData.getRoot();
    ModelPartData SmallClayGolem = modelPartData.addChild("SmallClayGolem",
        ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 25.0F, 0.0F));

    ModelPartData Torso = SmallClayGolem.addChild("Torso", ModelPartBuilder.create().uv(0, 0)
            .cuboid(-5.5F, -5.5F, -5.5F, 11.0F, 11.0F, 11.0F, new Dilation(0.0F)),
        ModelTransform.pivot(0.0F, -10.5F, 0.0F));

    ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(0, 22)
            .cuboid(-3.5F, -2.0F, -3.5F, 7.0F, 4.0F, 7.0F, new Dilation(0.0F)),
        ModelTransform.pivot(0.0F, -5.5F, 0.0F));

    ModelPartData LeftArm = Torso.addChild("LeftArm", ModelPartBuilder.create().uv(0, 33)
            .cuboid(0.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)),
        ModelTransform.pivot(5.5F, -3.5F, 0.0F));

    ModelPartData RightArm = Torso.addChild("RightArm", ModelPartBuilder.create().uv(28, 22)
            .cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)),
        ModelTransform.pivot(-5.5F, -3.5F, 0.0F));

    ModelPartData LeftLeg = Torso.addChild("LeftLeg", ModelPartBuilder.create().uv(32, 37)
            .cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.0F)),
        ModelTransform.pivot(3.0F, 5.5F, 0.0F));

    ModelPartData RightLeg = Torso.addChild("RightLeg", ModelPartBuilder.create().uv(16, 37)
            .cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.0F)),
        ModelTransform.pivot(-3.0F, 5.5F, 0.0F));
    return TexturedModelData.of(modelData, 64, 64);
  }

  @Override
  public void setAngles(
      SmallClayGolemEntity entity,
      float limbSwing,
      float limbSwingAmount,
      float ageInTicks,
      float netHeadYaw,
      float headPitch) {
    this.getPart().traverse().forEach(ModelPart::resetTransform);
    setHeadAngles(netHeadYaw, headPitch);

    this.animateMovement(SmallClayGolemAnimations.walk, limbSwing, limbSwingAmount, 2f, 2.5f);
    this.updateAnimation(entity.idleAnimationState, SmallClayGolemAnimations.idle, ageInTicks, 1f);
    this.updateAnimation(
        entity.attackAnimationState, SmallClayGolemAnimations.attack, ageInTicks, 1f);
    this.updateAnimation(entity.sitSwayAnimationState, SmallClayGolemAnimations.sit_sway,
        ageInTicks, 1f);
    this.updateAnimation(entity.sitWipAnimationState, SmallClayGolemAnimations.sit_wip, ageInTicks,
        1f);
    this.updateAnimation(entity.sitFlushAnimationState, SmallClayGolemAnimations.sit_flush,
        ageInTicks, 1f);
  }

  private void setHeadAngles(float headYaw, float headPitch) {
    headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
    headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

    head.yaw = (float) Math.toRadians(headYaw);
    head.pitch = (float) Math.toRadians(headPitch);
  }

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

    smallclaygolem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
  }

  @Override
  public ModelPart getPart() {
    return smallclaygolem;
  }
}
