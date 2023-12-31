package banduty.bsroleplay.entity.client;

import banduty.bsroleplay.entity.animation.ModAnimations;
import banduty.bsroleplay.entity.custom.HolyCloudEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class HolyCloudModel<T extends HolyCloudEntity> extends SinglePartEntityModel<T> {
	private final ModelPart holy_cloud;
	private final ModelPart head;

	public HolyCloudModel(ModelPart root) {
		this.holy_cloud = root.getChild("holy_cloud");
		this.head = holy_cloud.getChild("cloud").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData holy_cloud = modelPartData.addChild("holy_cloud", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cloud = holy_cloud.addChild("cloud", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = cloud.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData principal = body.addChild("principal", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -6.0F, -5.0F, 8.0F, 4.0F, 9.0F, new Dilation(0.0F))
		.uv(9, 23).cuboid(-4.0F, -8.0F, -4.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(2.0F, -8.0F, -4.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(14, 15).cuboid(-2.0F, -8.0F, -4.0F, 3.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(1.0F, -8.0F, -4.0F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData details = body.addChild("details", ModelPartBuilder.create().uv(0, 3).cuboid(-4.0F, -7.0F, 2.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(2.0F, -7.0F, 1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 25).cuboid(2.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(30, 23).cuboid(-2.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 23).cuboid(-2.0F, -7.0F, 2.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 21).cuboid(1.0F, -7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eighth_detail_r1 = details.addChild("eighth_detail_r1", ModelPartBuilder.create().uv(7, 30).cuboid(-2.0F, -8.0F, -3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 30).cuboid(-3.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData wings = body.addChild("wings", ModelPartBuilder.create().uv(25, 0).cuboid(4.0F, -6.5F, -4.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(23, 23).cuboid(-5.0F, -6.5F, -4.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = cloud.addChild("head", ModelPartBuilder.create().uv(0, 13).cuboid(-3.0F, -7.0F, -9.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(26, 18).cuboid(-1.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail = cloud.addChild("tail", ModelPartBuilder.create().uv(26, 13).cuboid(-2.0F, -4.5F, 4.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(16, 13).cuboid(-2.0F, -5.5F, 4.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 6).cuboid(-1.0F, -2.5F, 4.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 25).cuboid(0.0F, -3.5F, 7.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-1.0F, -5.5F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 15).cuboid(0.0F, -2.5F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 15).cuboid(2.0F, -3.5F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 13).cuboid(-3.0F, -4.5F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 25).cuboid(0.0F, -3.5F, 8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(HolyCloudEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.HOLY_CLOUD_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.HOLY_CLOUD_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.HOLY_CLOUD_ATTACK, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 25.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		holy_cloud.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return holy_cloud;
	}
}