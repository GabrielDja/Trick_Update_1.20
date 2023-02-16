package net.gabrieldja.trickupdate.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelboat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("trick_update_1_20", "modelboat"), "main");
	public final ModelPart front;
	public final ModelPart back;
	public final ModelPart left;
	public final ModelPart right;
	public final ModelPart bottom;
	public final ModelPart bottom_no_water;
	public final ModelPart paddle_left;
	public final ModelPart paddle_right;

	public Modelboat(ModelPart root) {
		this.front = root.getChild("front");
		this.back = root.getChild("back");
		this.left = root.getChild("left");
		this.right = root.getChild("right");
		this.bottom = root.getChild("bottom");
		this.bottom_no_water = root.getChild("bottom_no_water");
		this.paddle_left = root.getChild("paddle_left");
		this.paddle_right = root.getChild("paddle_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition front = partdefinition.addOrReplaceChild("front", CubeListBuilder.create().texOffs(0, 27).addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, -15.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition back = partdefinition.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 19).addBox(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 22.0F, 15.0F));
		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create().texOffs(0, 43).addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 22.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create().texOffs(0, 35).addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 22.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bottom = partdefinition.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition bottom_no_water = partdefinition.addOrReplaceChild("bottom_no_water", CubeListBuilder.create().texOffs(60, 42).addBox(-14.0F, -9.0F, -6.0F, 28.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 15.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition paddle_left = partdefinition.addOrReplaceChild("paddle_left",
				CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 13.0F, -3.0F, 2.1642F, 0.8727F, 2.8798F));
		PartDefinition paddle_right = partdefinition.addOrReplaceChild("paddle_right",
				CubeListBuilder.create().texOffs(62, 20).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(62, 20).addBox(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 13.0F, -3.0F, 2.1642F, -0.8727F, -2.8798F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		front.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		back.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bottom_no_water.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		paddle_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		paddle_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
