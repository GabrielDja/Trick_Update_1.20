
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.gabrieldja.trickupdate.block.HangingSignWarpedBlock;
import net.gabrieldja.trickupdate.block.HangingSignSpruceBlock;
import net.gabrieldja.trickupdate.block.HangingSignOakBlock;
import net.gabrieldja.trickupdate.block.HangingSignMangroveBlock;
import net.gabrieldja.trickupdate.block.HangingSignJungleBlock;
import net.gabrieldja.trickupdate.block.HangingSignDarkOakBlock;
import net.gabrieldja.trickupdate.block.HangingSignCrimsonBlock;
import net.gabrieldja.trickupdate.block.HangingSignBirchBlock;
import net.gabrieldja.trickupdate.block.HangingSignBambooBlock;
import net.gabrieldja.trickupdate.block.HangingSignAcaciaBlock;
import net.gabrieldja.trickupdate.block.ChiseledBookshelfBlock;
import net.gabrieldja.trickupdate.block.BambooTrapdoorBlock;
import net.gabrieldja.trickupdate.block.BambooStairBlock;
import net.gabrieldja.trickupdate.block.BambooSlabBlock;
import net.gabrieldja.trickupdate.block.BambooPressurePlateBlock;
import net.gabrieldja.trickupdate.block.BambooPlanksBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicStairBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicSlabBlock;
import net.gabrieldja.trickupdate.block.BambooMosaicBlock;
import net.gabrieldja.trickupdate.block.BambooFenceGateBlock;
import net.gabrieldja.trickupdate.block.BambooFenceBlock;
import net.gabrieldja.trickupdate.block.BambooDoorBlock;
import net.gabrieldja.trickupdate.block.BambooButtonBlock;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrickUpdate120Mod.MODID);
	public static final RegistryObject<Block> BAMBOO_DOOR = REGISTRY.register("bamboo_door", () -> new BambooDoorBlock());
	public static final RegistryObject<Block> BAMBOO_PLANKS = REGISTRY.register("bamboo_planks", () -> new BambooPlanksBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC = REGISTRY.register("bamboo_mosaic", () -> new BambooMosaicBlock());
	public static final RegistryObject<Block> BAMBOO_STAIR = REGISTRY.register("bamboo_stair", () -> new BambooStairBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_STAIR = REGISTRY.register("bamboo_mosaic_stair", () -> new BambooMosaicStairBlock());
	public static final RegistryObject<Block> BAMBOO_SLAB = REGISTRY.register("bamboo_slab", () -> new BambooSlabBlock());
	public static final RegistryObject<Block> BAMBOO_MOSAIC_SLAB = REGISTRY.register("bamboo_mosaic_slab", () -> new BambooMosaicSlabBlock());
	public static final RegistryObject<Block> BAMBOO_TRAPDOOR = REGISTRY.register("bamboo_trapdoor", () -> new BambooTrapdoorBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE = REGISTRY.register("bamboo_fence", () -> new BambooFenceBlock());
	public static final RegistryObject<Block> BAMBOO_FENCE_GATE = REGISTRY.register("bamboo_fence_gate", () -> new BambooFenceGateBlock());
	public static final RegistryObject<Block> BAMBOO_PRESSURE_PLATE = REGISTRY.register("bamboo_pressure_plate",
			() -> new BambooPressurePlateBlock());
	public static final RegistryObject<Block> BAMBOO_BUTTON = REGISTRY.register("bamboo_button", () -> new BambooButtonBlock());
	public static final RegistryObject<Block> CHISELED_BOOKSHELF = REGISTRY.register("chiseled_bookshelf", () -> new ChiseledBookshelfBlock());
	public static final RegistryObject<Block> HANGING_SIGN_OAK = REGISTRY.register("hanging_sign_oak", () -> new HangingSignOakBlock());
	public static final RegistryObject<Block> HANGING_SIGN_SPRUCE = REGISTRY.register("hanging_sign_spruce", () -> new HangingSignSpruceBlock());
	public static final RegistryObject<Block> HANGING_SIGN_DARK_OAK = REGISTRY.register("hanging_sign_dark_oak", () -> new HangingSignDarkOakBlock());
	public static final RegistryObject<Block> HANGING_SIGN_MANGROVE = REGISTRY.register("hanging_sign_mangrove",
			() -> new HangingSignMangroveBlock());
	public static final RegistryObject<Block> HANGING_SIGN_ACACIA = REGISTRY.register("hanging_sign_acacia", () -> new HangingSignAcaciaBlock());
	public static final RegistryObject<Block> HANGING_SIGN_BAMBOO = REGISTRY.register("hanging_sign_bamboo", () -> new HangingSignBambooBlock());
	public static final RegistryObject<Block> HANGING_SIGN_BIRCH = REGISTRY.register("hanging_sign_birch", () -> new HangingSignBirchBlock());
	public static final RegistryObject<Block> HANGING_SIGN_JUNGLE = REGISTRY.register("hanging_sign_jungle", () -> new HangingSignJungleBlock());
	public static final RegistryObject<Block> HANGING_SIGN_CRIMSON = REGISTRY.register("hanging_sign_crimson", () -> new HangingSignCrimsonBlock());
	public static final RegistryObject<Block> HANGING_SIGN_WARPED = REGISTRY.register("hanging_sign_warped", () -> new HangingSignWarpedBlock());
}
