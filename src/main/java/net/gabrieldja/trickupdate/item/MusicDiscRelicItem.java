
package net.gabrieldja.trickupdate.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

public class MusicDiscRelicItem extends RecordItem {
	public MusicDiscRelicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:relic")), new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
