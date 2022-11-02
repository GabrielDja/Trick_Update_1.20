
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.gabrieldja.trickupdate.item.WitherSpawnEggItem;
import net.gabrieldja.trickupdate.item.SpawnRaftItem;
import net.gabrieldja.trickupdate.item.SnowGolemSpawnEggItem;
import net.gabrieldja.trickupdate.item.IronGolemSpawnEggItem;
import net.gabrieldja.trickupdate.item.EnderDragonSpawnEggItem;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrickUpdate120Mod.MODID);
	public static final RegistryObject<Item> BAMBOO_DOOR = doubleBlock(TrickUpdate120ModBlocks.BAMBOO_DOOR,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_PLANKS = block(TrickUpdate120ModBlocks.BAMBOO_PLANKS, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_MOSAIC = block(TrickUpdate120ModBlocks.BAMBOO_MOSAIC, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_STAIR = block(TrickUpdate120ModBlocks.BAMBOO_STAIR, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_MOSAIC_STAIR = block(TrickUpdate120ModBlocks.BAMBOO_MOSAIC_STAIR,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_SLAB = block(TrickUpdate120ModBlocks.BAMBOO_SLAB, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_MOSAIC_SLAB = block(TrickUpdate120ModBlocks.BAMBOO_MOSAIC_SLAB,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_TRAPDOOR = block(TrickUpdate120ModBlocks.BAMBOO_TRAPDOOR,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_FENCE = block(TrickUpdate120ModBlocks.BAMBOO_FENCE, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_FENCE_GATE = block(TrickUpdate120ModBlocks.BAMBOO_FENCE_GATE,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_PRESSURE_PLATE = block(TrickUpdate120ModBlocks.BAMBOO_PRESSURE_PLATE,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> BAMBOO_BUTTON = block(TrickUpdate120ModBlocks.BAMBOO_BUTTON, TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> CHISELED_BOOKSHELF = block(TrickUpdate120ModBlocks.CHISELED_BOOKSHELF,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_OAK = block(TrickUpdate120ModBlocks.HANGING_SIGN_OAK,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_SPRUCE = block(TrickUpdate120ModBlocks.HANGING_SIGN_SPRUCE,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_DARK_OAK = block(TrickUpdate120ModBlocks.HANGING_SIGN_DARK_OAK,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_MANGROVE = block(TrickUpdate120ModBlocks.HANGING_SIGN_MANGROVE,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_ACACIA = block(TrickUpdate120ModBlocks.HANGING_SIGN_ACACIA,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_BAMBOO = block(TrickUpdate120ModBlocks.HANGING_SIGN_BAMBOO,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_BIRCH = block(TrickUpdate120ModBlocks.HANGING_SIGN_BIRCH,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_JUNGLE = block(TrickUpdate120ModBlocks.HANGING_SIGN_JUNGLE,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_CRIMSON = block(TrickUpdate120ModBlocks.HANGING_SIGN_CRIMSON,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> HANGING_SIGN_WARPED = block(TrickUpdate120ModBlocks.HANGING_SIGN_WARPED,
			TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120);
	public static final RegistryObject<Item> SPAWN_RAFT = REGISTRY.register("spawn_raft", () -> new SpawnRaftItem());
	public static final RegistryObject<Item> IRON_GOLEM_SPAWN_EGG = REGISTRY.register("iron_golem_spawn_egg", () -> new IronGolemSpawnEggItem());
	public static final RegistryObject<Item> SNOW_GOLEM_SPAWN_EGG = REGISTRY.register("snow_golem_spawn_egg", () -> new SnowGolemSpawnEggItem());
	public static final RegistryObject<Item> WITHER_SPAWN_EGG = REGISTRY.register("wither_spawn_egg", () -> new WitherSpawnEggItem());
	public static final RegistryObject<Item> ENDER_DRAGON_SPAWN_EGG = REGISTRY.register("ender_dragon_spawn_egg",
			() -> new EnderDragonSpawnEggItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
