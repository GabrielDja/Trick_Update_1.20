
package net.gabrieldja.trickupdate.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.gabrieldja.trickupdate.world.inventory.ChiseledBookshelfUIMenu;
import net.gabrieldja.trickupdate.procedures.ChiseledBookshelfPickupSoundProcedure;
import net.gabrieldja.trickupdate.procedures.ChiseledBookshelfInsertSoundProcedure;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChiseledBookshelfUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public ChiseledBookshelfUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public ChiseledBookshelfUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(ChiseledBookshelfUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(ChiseledBookshelfUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = ChiseledBookshelfUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 0 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 0 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 0 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 1 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 1 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 1 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 2 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 2 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 2 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 3 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 3 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 3 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 4 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 4 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 4 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 5 && changeType == 0) {

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 5 && changeType == 1) {

			ChiseledBookshelfPickupSoundProcedure.execute(world, x, y, z);
		}
		if (slotID == 5 && changeType == 2) {
			int amount = meta;

			ChiseledBookshelfInsertSoundProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TrickUpdate120Mod.addNetworkMessage(ChiseledBookshelfUISlotMessage.class, ChiseledBookshelfUISlotMessage::buffer,
				ChiseledBookshelfUISlotMessage::new, ChiseledBookshelfUISlotMessage::handler);
	}
}
