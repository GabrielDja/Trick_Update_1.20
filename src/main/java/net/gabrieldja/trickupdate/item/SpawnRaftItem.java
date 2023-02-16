
package net.gabrieldja.trickupdate.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.gabrieldja.trickupdate.procedures.SpawnRaftLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure;
import net.gabrieldja.trickupdate.init.TrickUpdate120ModTabs;

public class SpawnRaftItem extends Item {
	public SpawnRaftItem() {
		super(new Item.Properties().tab(TrickUpdate120ModTabs.TAB_TRICK_UPDATE_120).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SpawnRaftLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
