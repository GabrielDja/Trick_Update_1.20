
package net.gabrieldja.trickupdate.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.gabrieldja.trickupdate.entity.CherryBoatEntity;
import net.gabrieldja.trickupdate.client.model.Modelboat;

public class CherryBoatRenderer extends MobRenderer<CherryBoatEntity, Modelboat<CherryBoatEntity>> {
	public CherryBoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboat(context.bakeLayer(Modelboat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CherryBoatEntity entity) {
		return new ResourceLocation("trick_update_1_20:textures/entities/cherry.png");
	}
}
