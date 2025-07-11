package com.mrsalty.claygolems.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class SmallClayGolemAnimations {

  public static final Animation WALK =
      Animation.Builder.create(1.25f)
          .looping()
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0.1f, 0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createTranslationalVector(-0.1f, 0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0.1f, 0.2f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.04167f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.16667f,
                      AnimationHelper.createTranslationalVector(0f, 0.02f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.5f,
                      AnimationHelper.createTranslationalVector(0f, -0.02f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createTranslationalVector(0f, 0.02f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.125f,
                      AnimationHelper.createTranslationalVector(0f, -0.02f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, -0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, 0f, -0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0f, 0f, -0.2f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(5f, 0f, -2.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(-10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createRotationalVector(5f, 0f, -2.5f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createTranslationalVector(0f, 0f, -0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createTranslationalVector(0f, 0f, -0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0.2f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(5f, 0f, 2.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createRotationalVector(-10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createTranslationalVector(0f, 0.22f, -0.63f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, -0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createRotationalVector(-25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0.22f, -0.63f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, -0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createTranslationalVector(0f, 0.22f, -0.63f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(-25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.91667f,
                      AnimationHelper.createRotationalVector(25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.25f,
                      AnimationHelper.createRotationalVector(25f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .build();
  public static final Animation ATTACK =
      Animation.Builder.create(1.25f)
          .looping()
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createTranslationalVector(0f, -0.34f, -0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, -0.14f, -0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createTranslationalVector(0f, 0.2f, 0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createTranslationalVector(0f, 1f, 0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createTranslationalVector(0f, 0.06f, -0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createTranslationalVector(0f, 0.06f, -0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createRotationalVector(5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(-10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createRotationalVector(-10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createRotationalVector(20f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(20f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createRotationalVector(5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.08333f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(-205f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(-205f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.70833f,
                      AnimationHelper.createRotationalVector(-88.56f, 29.99f, 0.72f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createRotationalVector(27.5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(27.5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(-185f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.54167f,
                      AnimationHelper.createRotationalVector(-185f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.625f,
                      AnimationHelper.createRotationalVector(-82.79f, -29.8f, -3.6f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.70833f,
                      AnimationHelper.createRotationalVector(17.5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(17.5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createTranslationalVector(0f, 0.34f, 0.04f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, 0.14f, 0.03f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0.03f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createTranslationalVector(0f, 0.2f, -0.04f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createTranslationalVector(0f, -0.08f, -0.15f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createRotationalVector(-3.93f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(-3.93f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createRotationalVector(-21.43f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(-21.43f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createTranslationalVector(0f, 0.34f, 0.04f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createTranslationalVector(0f, 0.14f, 0.03f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0.03f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createTranslationalVector(0f, 0.2f, -0.04f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createTranslationalVector(0f, -0.08f, -0.15f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.20833f,
                      AnimationHelper.createRotationalVector(-3.93f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.29167f,
                      AnimationHelper.createRotationalVector(-3.93f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.41667f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.58333f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.79167f,
                      AnimationHelper.createRotationalVector(-21.43f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.95833f,
                      AnimationHelper.createRotationalVector(-21.43f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.20833f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .build();
  public static final Animation SIT_SWAY =
      Animation.Builder.create(3f)
          .looping()
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createTranslationalVector(-0.2f, -1f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createTranslationalVector(0.2f, -1f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-35f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createRotationalVector(-34.9f, -2.87f, -4.1f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createRotationalVector(-35f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createRotationalVector(-34.9f, 2.87f, 4.1f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createRotationalVector(-35f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0.3f, -0.05f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createRotationalVector(9.59f, 5.72f, -8.22f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createRotationalVector(9.59f, -5.72f, 8.22f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createRotationalVector(10f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createTranslationalVector(0.07f, -0.12f, 0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createTranslationalVector(-0.07f, 0.12f, -0.14f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(48.24f, 15.19f, -13.17f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createTranslationalVector(0.04f, 0.13f, -0.15f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createTranslationalVector(-0.04f, -0.13f, 0.15f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(49.32f, -9.54f, 8.11f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0.15f, -0.38f, -0.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createTranslationalVector(0.14f, -0.49f, -0.44f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createTranslationalVector(0.15f, -0.38f, -0.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createTranslationalVector(0.15f, -0.32f, -0.2f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(0.15f, -0.38f, -0.28f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-36.01f, -17.66f, -9.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createRotationalVector(-28.51f, -17.66f, -9.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createRotationalVector(-36.01f, -17.66f, -9.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createRotationalVector(-43.51f, -17.66f, -9.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createRotationalVector(-36.01f, -17.66f, -9.54f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(-0.14f, -0.37f, -0.3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createTranslationalVector(-0.14f, -0.31f, -0.22f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createTranslationalVector(-0.14f, -0.37f, -0.3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createTranslationalVector(-0.14f, -0.43f, -0.38f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(-0.14f, -0.37f, -0.3f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-38.87f, 15.47f, 8.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.75f,
                      AnimationHelper.createRotationalVector(-46.37f, 15.47f, 8.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.5f,
                      AnimationHelper.createRotationalVector(-38.87f, 15.47f, 8.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.25f,
                      AnimationHelper.createRotationalVector(-31.37f, 15.47f, 8.28f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createRotationalVector(-38.87f, 15.47f, 8.28f),
                      Transformation.Interpolations.CUBIC)))
          .build();
  public static final Animation SIT_FLUSH =
      Animation.Builder.create(1f)
          .looping()
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -0.3f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(-0.9f, -0.1f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0.9f, -0.1f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 1.1f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 1.1f, 0f),
                      Transformation.Interpolations.LINEAR)))
          .build();
  public static final Animation SIT_FLUSH_LOOK =
      Animation.Builder.create(3f)
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.25f,
                      AnimationHelper.createTranslationalVector(0f, 0.5f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.5f,
                      AnimationHelper.createTranslationalVector(0f, 0.3f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.5f,
                      AnimationHelper.createTranslationalVector(0f, 0.3f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.75f,
                      AnimationHelper.createTranslationalVector(0f, 0.5f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0.5f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.83333f,
                      AnimationHelper.createRotationalVector(0f, 25f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.33333f,
                      AnimationHelper.createRotationalVector(0f, 25f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.66667f,
                      AnimationHelper.createRotationalVector(0f, -25f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.16667f,
                      AnimationHelper.createRotationalVector(0f, -25f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.5f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .build();
  public static final Animation SIT_WIP =
      Animation.Builder.create(4f)
          .looping()
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -1f, -0.32f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.67f, 0.1f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createTranslationalVector(0f, -1f, -0.32f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createTranslationalVector(0f, -1f, -0.32f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.67f, 0.1f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3.375f,
                      AnimationHelper.createTranslationalVector(0f, -1f, -0.32f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createTranslationalVector(0f, -1f, -0.32f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Torso",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3.375f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "Head",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1f,
                      AnimationHelper.createRotationalVector(6.87f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3f,
                      AnimationHelper.createRotationalVector(6.87f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      3.41667f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(0f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createTranslationalVector(0.02f, -0.28f, -0.18f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.23f, 0.01f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createTranslationalVector(0.02f, -0.28f, -0.18f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.23f, 0.01f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createRotationalVector(-65f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createRotationalVector(-65f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(-75f, 5f, 3f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createTranslationalVector(0.02f, -0.28f, -0.18f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.23f, 0.01f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createTranslationalVector(0.02f, -0.28f, -0.18f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createTranslationalVector(0f, -0.23f, 0.01f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createTranslationalVector(0f, -0.2f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightArm",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createRotationalVector(-65f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createRotationalVector(-65f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(-75f, -5f, -3f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createTranslationalVector(0f, 0.5f, -1.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createTranslationalVector(0f, 0.5f, -1.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "LeftLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createRotationalVector(-2.75f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createRotationalVector(-2.75f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.TRANSLATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createTranslationalVector(0f, 0.53f, -1.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createTranslationalVector(0f, 0.53f, -1.54f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createTranslationalVector(0f, 0.95f, -1.5f),
                      Transformation.Interpolations.CUBIC)))
          .addBoneAnimation(
              "RightLeg",
              new Transformation(
                  Transformation.Targets.ROTATE,
                  new Keyframe(
                      0f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.33333f,
                      AnimationHelper.createRotationalVector(-3f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      0.66667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      1.41667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.33333f,
                      AnimationHelper.createRotationalVector(-3f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      2.66667f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC),
                  new Keyframe(
                      4f,
                      AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                      Transformation.Interpolations.CUBIC)))
          .build();
  public static final Animation IDLE = Animation.Builder.create(3f).looping().build();
}
