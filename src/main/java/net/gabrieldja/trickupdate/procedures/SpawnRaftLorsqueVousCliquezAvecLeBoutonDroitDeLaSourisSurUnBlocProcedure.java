package net.gabrieldja.trickupdate.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.gabrieldja.trickupdate.init.TrickUpdate120ModEntities;
import net.gabrieldja.trickupdate.entity.RaftEntity;

public class SpawnRaftLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new RaftEntity(TrickUpdate120ModEntities.RAFT.get(), _level);
			entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(),
						_ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
						_ent.getDisplayName(), _ent.level.getServer(), _ent), "clear @s[gamemode=!creative] trick_update_1_20:spawn_raft 1");
			}
		}
	}
}
