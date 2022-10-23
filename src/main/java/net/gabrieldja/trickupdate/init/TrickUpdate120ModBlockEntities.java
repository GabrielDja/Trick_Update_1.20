
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.gabrieldja.trickupdate.block.entity.ChiseledBookshelfBlockEntity;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			TrickUpdate120Mod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHISELED_BOOKSHELF = register("chiseled_bookshelf",
			TrickUpdate120ModBlocks.CHISELED_BOOKSHELF, ChiseledBookshelfBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
