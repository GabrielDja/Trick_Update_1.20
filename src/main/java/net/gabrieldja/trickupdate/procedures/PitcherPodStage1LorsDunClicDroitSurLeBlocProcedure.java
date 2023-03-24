package net.gabrieldja.trickupdate.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModBlocks;

public class PitcherPodStage1LorsDunClicDroitSurLeBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.PITCHER_POD_STAGE_2.get().defaultBlockState(), 3);
		}
	}
}
