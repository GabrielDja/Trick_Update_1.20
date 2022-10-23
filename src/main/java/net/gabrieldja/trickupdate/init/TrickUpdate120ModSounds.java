
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TrickUpdate120Mod.MODID);
	public static final RegistryObject<SoundEvent> BAMBOO_DOOR = REGISTRY.register("bamboo_door",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_door")));
	public static final RegistryObject<SoundEvent> BAMBOO_BLOCK_BREAK = REGISTRY.register("bamboo_block_break",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_block_break")));
	public static final RegistryObject<SoundEvent> BAMBOO_BLOCK_FALLING = REGISTRY.register("bamboo_block_falling",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_block_falling")));
	public static final RegistryObject<SoundEvent> BAMBOO_BLOCK_BREAKING = REGISTRY.register("bamboo_block_breaking",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_block_breaking")));
	public static final RegistryObject<SoundEvent> BAMBOO_BLOCK_PLACE = REGISTRY.register("bamboo_block_place",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_block_place")));
	public static final RegistryObject<SoundEvent> BAMBOO_BLOCK_FOOTSTEPS = REGISTRY.register("bamboo_block_footsteps",
			() -> new SoundEvent(new ResourceLocation("trick_update_1_20", "bamboo_block_footsteps")));
}
