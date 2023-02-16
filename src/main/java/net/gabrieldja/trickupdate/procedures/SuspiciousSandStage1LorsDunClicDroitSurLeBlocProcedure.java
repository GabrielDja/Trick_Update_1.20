package net.gabrieldja.trickupdate.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModItems;
import net.gabrieldja.trickupdate.init.TrickUpdate120ModBlocks;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class SuspiciousSandStage1LorsDunClicDroitSurLeBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TrickUpdate120ModItems.BRUSH.get()) {
			TrickUpdate120Mod.queueServerWork(10, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.break")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.break")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos(x, y, z), TrickUpdate120ModBlocks.SUSPICIOUS_SAND_STAGE_2.get().defaultBlockState(), 3);
			});
		}
	}
}
