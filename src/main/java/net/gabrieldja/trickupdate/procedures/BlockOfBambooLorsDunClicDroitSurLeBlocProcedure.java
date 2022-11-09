package net.gabrieldja.trickupdate.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModBlocks;

public class BlockOfBambooLorsDunClicDroitSurLeBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOODEN_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STONE_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_AXE) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.STRIPPED_BLOCK_OF_BAMBOO.get().defaultBlockState(), 3);
		}
	}
}
