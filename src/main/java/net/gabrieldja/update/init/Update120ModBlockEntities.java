
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.update.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.gabrieldja.update.block.entity.HangingSignBlockEntity;
import net.gabrieldja.update.block.entity.ChiseledBookshelfBlockEntity;
import net.gabrieldja.update.Update120Mod;

public class Update120ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			Update120Mod.MODID);
	public static final RegistryObject<BlockEntityType<?>> HANGING_SIGN = register("hanging_sign", Update120ModBlocks.HANGING_SIGN,
			HangingSignBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHISELED_BOOKSHELF = register("chiseled_bookshelf", Update120ModBlocks.CHISELED_BOOKSHELF,
			ChiseledBookshelfBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
