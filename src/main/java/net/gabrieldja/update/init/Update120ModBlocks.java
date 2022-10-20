
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.update.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.gabrieldja.update.block.HangingSignBlock;
import net.gabrieldja.update.block.ChiseledBookshelfBlock;
import net.gabrieldja.update.block.BambooTrapdoorBlock;
import net.gabrieldja.update.block.BambooStairBlock;
import net.gabrieldja.update.block.BambooSlabBlock;
import net.gabrieldja.update.block.BambooPressurePlateBlock;
import net.gabrieldja.update.block.BambooPlanksBlock;
import net.gabrieldja.update.block.BambooMosaicBlock;
import net.gabrieldja.update.block.BambooFenceGateBlock;
import net.gabrieldja.update.block.BambooFenceBlock;
import net.gabrieldja.update.block.BambooDoorBlock;
import net.gabrieldja.update.block.BambooButtonBlock;
import net.gabrieldja.update.Update120Mod;

public class Update120ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Update120Mod.MODID);
	public static final RegistryObject<Block> HANGING_SIGN = REGISTRY.register("hanging_sign", () -> new HangingSignBlock());
	public static final RegistryObject<Block> BAMBOO_PLANKS = REGISTRY.register("bamboo_planks", () -> new BambooPlanksBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC = REGISTRY.register("bamboo_mosaic", () -> new BambooMosaicBlock());
	public static final RegistryObject<Block> CHISELED_BOOKSHELF = REGISTRY.register("chiseled_bookshelf", () -> new ChiseledBookshelfBlock());
	public static final RegistryObject<Block> BAMBOO_SLAB = REGISTRY.register("bamboo_slab", () -> new BambooSlabBlock());
	public static final RegistryObject<Block> BAMBOO_STAIR = REGISTRY.register("bamboo_stair", () -> new BambooStairBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE = REGISTRY.register("bamboo_fence", () -> new BambooFenceBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE_GATE = REGISTRY.register("bamboo_fence_gate", () -> new BambooFenceGateBlock());
	public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = REGISTRY.register("bamboo_pressure_plate",
			() -> new BambooPressurePlateBlock());
	public static final RegistryObject<Block> BAMBOO_BUTTON = REGISTRY.register("bamboo_button", () -> new BambooButtonBlock());
	public static final RegistryObject<Block> BAMBOO_DOOR = REGISTRY.register("bamboo_door", () -> new BambooDoorBlock());
	public static final RegistryObject<Block> BAMBOO_TRAPDOOR = REGISTRY.register("bamboo_trapdoor", () -> new BambooTrapdoorBlock());
}
