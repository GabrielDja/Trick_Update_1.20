
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.gabrieldja.trickupdate.client.model.Modelraft;
import net.gabrieldja.trickupdate.client.model.Modelboat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TrickUpdate120ModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelboat.LAYER_LOCATION, Modelboat::createBodyLayer);
		event.registerLayerDefinition(Modelraft.LAYER_LOCATION, Modelraft::createBodyLayer);
	}
}
