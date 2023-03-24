
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

import java.util.List;

public class SnoutArmorTrimSmithingTemplateItem extends Item {
	public SnoutArmorTrimSmithingTemplateItem() {
		super(new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Snout Armor Trim"));
		list.add(Component.literal("Applies to:"));
		list.add(Component.literal("\u00A72Armor"));
		list.add(Component.literal("Ingredients:"));
		list.add(Component.literal("\u00A72Ingot & Crystal"));
	}
}
