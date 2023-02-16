
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

public class PotteryShardSkullItem extends Item {
	public PotteryShardSkullItem() {
		super(new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).stacksTo(64).rarity(Rarity.COMMON));
	}
}
