
package net.gabrieldja.trickupdate.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.gabrieldja.trickupdate.procedures.BambooTrapdoorLorsDunClicDroitSurLeBlocProcedure;

import java.util.List;
import java.util.Collections;

public class BambooTrapdoorBlock extends TrapDoorBlock {
	public BambooTrapdoorBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_footsteps")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_breaking")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_falling"))))
				.strength(3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		BambooTrapdoorLorsDunClicDroitSurLeBlocProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}
