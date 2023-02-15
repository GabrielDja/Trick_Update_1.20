
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.gabrieldja.trickupdate.procedures.EnderDragonSpawnEggLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure;

public class EnderDragonSpawnEggItem extends Item {
	public EnderDragonSpawnEggItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		EnderDragonSpawnEggLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
