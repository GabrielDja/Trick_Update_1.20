
package net.gabrieldja.trickupdate.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.gabrieldja.trickupdate.entity.RaftEntity;
import net.gabrieldja.trickupdate.client.model.Modelraft;

public class RaftRenderer extends MobRenderer<RaftEntity, Modelraft<RaftEntity>> {
	public RaftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelraft(context.bakeLayer(Modelraft.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaftEntity entity) {
		return new ResourceLocation("trick_update_1_20:textures/entities/raft.png");
	}
}
