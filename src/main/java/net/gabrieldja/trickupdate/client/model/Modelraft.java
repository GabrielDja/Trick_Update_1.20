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

// Made with Blockbench 4.5.0-beta.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelraft<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("trick_update_1_20", "modelraft"), "main");
	public final ModelPart bottom;
	public final ModelPart paddle_left;
	public final ModelPart paddle_right;

	public Modelraft(ModelPart root) {
		this.bottom = root.getChild("bottom");
		this.paddle_left = root.getChild("paddle_left");
		this.paddle_right = root.getChild("paddle_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bottom = partdefinition.addOrReplaceChild("bottom",
				CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -11.0F, 2.0F, 28.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -9.0F, -2.0F, 28.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 21.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition paddle_left = partdefinition.addOrReplaceChild("paddle_left",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 13.0F, -3.0F, 2.1642F, 0.8727F, 2.8798F));
		PartDefinition paddle_right = partdefinition.addOrReplaceChild("paddle_right",
				CubeListBuilder.create().texOffs(40, 24).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 13.0F, -3.0F, 2.1642F, -0.8727F, -2.8798F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		paddle_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		paddle_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
