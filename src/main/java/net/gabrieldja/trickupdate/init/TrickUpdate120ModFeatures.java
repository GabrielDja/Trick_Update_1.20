
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.gabrieldja.trickupdate.world.features.PinkPetalsGenerationFeature;
import net.gabrieldja.trickupdate.world.features.CherryBlossomFeature;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

@Mod.EventBusSubscriber
public class TrickUpdate120ModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TrickUpdate120Mod.MODID);
	public static final RegistryObject<Feature<?>> PINK_PETALS_GENERATION = REGISTRY.register("pink_petals_generation", PinkPetalsGenerationFeature::new);
	public static final RegistryObject<Feature<?>> CHERRY_BLOSSOM = REGISTRY.register("cherry_blossom", CherryBlossomFeature::feature);
}
