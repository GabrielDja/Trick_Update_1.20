
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.update.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.gabrieldja.update.client.gui.ChiseledBookshelfUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Update120ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(Update120ModMenus.CHISELED_BOOKSHELF_UI.get(), ChiseledBookshelfUIScreen::new);
		});
	}
}
