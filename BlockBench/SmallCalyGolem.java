// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SmallCalyGolem extends EntityModel<Entity> {
	private final ModelPart SmallClayGolem;
	private final ModelPart Torso;
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	public SmallCalyGolem(ModelPart root) {
		this.SmallClayGolem = root.getChild("SmallClayGolem");
		this.Torso = this.SmallClayGolem.getChild("Torso");
		this.Head = this.Torso.getChild("Head");
		this.LeftArm = this.Torso.getChild("LeftArm");
		this.RightArm = this.Torso.getChild("RightArm");
		this.LeftLeg = this.Torso.getChild("LeftLeg");
		this.RightLeg = this.Torso.getChild("RightLeg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData SmallClayGolem = modelPartData.addChild("SmallClayGolem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 25.0F, 0.0F));

		ModelPartData Torso = SmallClayGolem.addChild("Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-5.5F, -5.5F, -5.5F, 11.0F, 11.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -10.5F, 0.0F));

		ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(0, 22).cuboid(-3.5F, -2.0F, -3.5F, 7.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.5F, 0.0F));

		ModelPartData LeftArm = Torso.addChild("LeftArm", ModelPartBuilder.create().uv(0, 33).cuboid(0.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, -3.5F, 0.0F));

		ModelPartData RightArm = Torso.addChild("RightArm", ModelPartBuilder.create().uv(28, 22).cuboid(-4.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -3.5F, 0.0F));

		ModelPartData LeftLeg = Torso.addChild("LeftLeg", ModelPartBuilder.create().uv(32, 37).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, 5.5F, 0.0F));

		ModelPartData RightLeg = Torso.addChild("RightLeg", ModelPartBuilder.create().uv(16, 37).cuboid(-2.0F, -3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 5.5F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		SmallClayGolem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}