// Made with Blockbench 4.12.4
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
		ModelPartData SmallClayGolem = modelPartData.addChild("SmallClayGolem", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Torso = SmallClayGolem.addChild("Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.5F, 0.0F));

		ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(0, 6).cuboid(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, 0.0F));

		ModelPartData LeftArm = Torso.addChild("LeftArm", ModelPartBuilder.create().uv(0, 9).cuboid(0.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -1.0F, 0.0F));

		ModelPartData RightArm = Torso.addChild("RightArm", ModelPartBuilder.create().uv(8, 6).cuboid(-1.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -1.0F, 0.0F));

		ModelPartData LeftLeg = Torso.addChild("LeftLeg", ModelPartBuilder.create().uv(8, 10).cuboid(-0.6F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 1.0F, 0.0F));

		ModelPartData RightLeg = Torso.addChild("RightLeg", ModelPartBuilder.create().uv(4, 9).cuboid(-0.4F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 1.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		SmallClayGolem.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}