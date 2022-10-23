
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TrickUpdate120ModTabs {
	public static CreativeModeTab TAB_TRICK_UPDATE_120;

	public static void load() {
		TAB_TRICK_UPDATE_120 = new CreativeModeTab("tabtrick_update_120") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TrickUpdate120ModBlocks.BAMBOO_MOSAIC.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
