
package net.gabrieldja.trickupdate.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class BambooMosaicStairBlock extends StairBlock {
	public BambooMosaicStairBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_break")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_footsteps")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_breaking")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("trick_update_1_20:bamboo_block_falling"))))
				.strength(2f, 3f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
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
}
