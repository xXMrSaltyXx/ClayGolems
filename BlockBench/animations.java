// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.12.5
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Author
 */
public class SmallCalyGolemAnimation {
	public static final Animation walk = Animation.Builder.create(1.25F).looping()
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.35F, 0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(-0.35F, 0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.35F, 0.7F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.07F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.07F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, 0.07F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.125F, AnimationHelper.createTranslationalVector(0.0F, -0.07F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, -2.5F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.7F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 2.5F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.7F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.77F, -2.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, -1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.77F, -2.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, -1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 1.75F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.77F, -2.0F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation attack = Animation.Builder.create(1.25F).looping()
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, -2.19F, -0.49F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, -0.49F, -0.49F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.0F, 0.7F, 0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 3.5F, 0.7F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, 0.21F, -1.49F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.21F, -1.49F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.0833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-205.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-205.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7083F, AnimationHelper.createRotationalVector(-88.5567F, 29.9921F, 0.7216F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(-185.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-185.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-82.7926F, -29.8036F, -3.5966F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7083F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-3.93F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-3.93F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createRotationalVector(-21.43F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-21.43F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 2.1847F, 0.157F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.4873F, 0.096F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6894F, 0.1216F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.7137F, -0.1381F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, -0.2637F, -0.5217F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createRotationalVector(-3.93F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createRotationalVector(-3.93F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createRotationalVector(-21.43F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-21.43F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2083F, AnimationHelper.createTranslationalVector(0.0F, 2.1847F, 0.157F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.4873F, 0.096F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.6894F, 0.1216F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.7137F, -0.1381F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, -0.2637F, -0.5217F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation sit_sway = Animation.Builder.create(3.0F).looping()
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-34.8974F, -2.8654F, -4.0992F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-34.8974F, 2.8654F, 4.0992F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(-0.7F, -3.5F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.7F, -3.5F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(9.589F, 5.7162F, -8.2189F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(9.589F, -5.7162F, 8.2189F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.2954F, -0.0521F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(48.2367F, 15.1889F, -13.1678F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.2394F, -0.4228F, 0.5039F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(-0.2394F, 0.4228F, -0.5039F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(49.3218F, -9.5438F, 8.1102F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.1515F, 0.4393F, -0.5235F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(-0.1515F, -0.4393F, 0.5235F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.0146F, -17.6605F, -9.5401F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-28.5146F, -17.6605F, -9.5401F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-36.0146F, -17.6605F, -9.5401F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-43.5146F, -17.6605F, -9.5401F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-36.0146F, -17.6605F, -9.5401F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5425F, -1.3442F, -0.9805F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.49F, -1.73F, -1.5534F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.5425F, -1.3442F, -0.9805F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.5075F, -1.13F, -0.6933F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.5425F, -1.3442F, -0.9805F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-38.873F, 15.4697F, 8.2834F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-46.373F, 15.4697F, 8.2834F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-38.873F, 15.4697F, 8.2834F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-31.373F, 15.4697F, 8.2834F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-38.873F, 15.4697F, 8.2834F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.4862F, -1.306F, -1.0585F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(-0.4725F, -1.095F, -0.7633F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(-0.4862F, -1.306F, -1.0585F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(-0.4725F, -1.495F, -1.3367F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(-0.4862F, -1.306F, -1.0585F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation sit_flush = Animation.Builder.create(1.0F).looping()
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.05F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-3.15F, -0.35F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(3.15F, -0.35F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 3.85F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 3.85F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation sit_flush_look = Animation.Builder.create(3.0F)
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, 25.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 25.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.6667F, AnimationHelper.createRotationalVector(0.0F, -25.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.1667F, AnimationHelper.createRotationalVector(0.0F, -25.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 1.75F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 1.05F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 1.05F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 1.75F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation sit_wip = Animation.Builder.create(4.0F).looping()
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.375F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Torso", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, -1.1375F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, -2.345F, 0.35F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, -1.1375F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, -1.1375F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, -2.345F, 0.35F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.375F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, -1.1375F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -3.5F, -1.1375F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("Head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(6.87F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(6.87F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(3.4167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-65.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-65.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-75.0F, 5.0F, 3.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0707F, -0.9925F, -0.632F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0017F, -0.8022F, 0.0436F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createTranslationalVector(0.0707F, -0.9925F, -0.632F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0017F, -0.8022F, 0.0436F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-65.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-65.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-75.0F, -5.0F, -3.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0707F, -0.9925F, -0.632F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0017F, -0.8022F, 0.0436F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createTranslationalVector(0.0707F, -0.9925F, -0.632F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0017F, -0.8022F, 0.0436F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -0.7F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-2.75F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-2.75F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("LeftLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 1.7562F, -5.3907F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createTranslationalVector(0.0F, 1.7562F, -5.3907F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-3.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createRotationalVector(-3.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
		))
		.addBoneAnimation("RightLeg", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 1.8436F, -5.3857F), Transformation.Interpolations.CUBIC),
			new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(1.4167F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.3333F, AnimationHelper.createTranslationalVector(0.0F, 1.8436F, -5.3857F), Transformation.Interpolations.CUBIC),
			new Keyframe(2.6667F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 3.3243F, -5.2347F), Transformation.Interpolations.CUBIC)
		))
		.build();

	public static final Animation idle = Animation.Builder.create(3.0F).looping()
		
		.build();
}