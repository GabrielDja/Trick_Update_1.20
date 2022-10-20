
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.update.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.gabrieldja.update.Update120Mod;

public class Update120ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Update120Mod.MODID);
	public static final RegistryObject<Item> HANGING_SIGN = block(Update120ModBlocks.HANGING_SIGN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAMBOO_PLANKS = block(Update120ModBlocks.BAMBOO_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_MOSAIC = block(Update120ModBlocks.BAMBOO_MOSAIC, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHISELED_BOOKSHELF = block(Update120ModBlocks.CHISELED_BOOKSHELF, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BAMBOO_SLAB = block(Update120ModBlocks.BAMBOO_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_STAIR = block(Update120ModBlocks.BAMBOO_STAIR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_FENCE = block(Update120ModBlocks.BAMBOO_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_FENCE_GATE = block(Update120ModBlocks.BAMBOO_FENCE_GATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_PRESSURE_PLATE = block(Update120ModBlocks.BAMBOO_PRESSURE_PLATE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_BUTTON = block(Update120ModBlocks.BAMBOO_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_DOOR = doubleBlock(Update120ModBlocks.BAMBOO_DOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAMBOO_TRAPDOOR = block(Update120ModBlocks.BAMBOO_TRAPDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
