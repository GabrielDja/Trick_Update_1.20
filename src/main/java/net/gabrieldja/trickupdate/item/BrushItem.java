
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

public class BrushItem extends Item {
	public BrushItem() {
		super(new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).durability(64).rarity(Rarity.COMMON));
	}
}
