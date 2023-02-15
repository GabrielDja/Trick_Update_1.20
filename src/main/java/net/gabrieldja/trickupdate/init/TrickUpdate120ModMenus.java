
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.trickupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.gabrieldja.trickupdate.world.inventory.ChiseledBookshelfUIMenu;
import net.gabrieldja.trickupdate.TrickUpdate120Mod;

public class TrickUpdate120ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TrickUpdate120Mod.MODID);
	public static final RegistryObject<MenuType<ChiseledBookshelfUIMenu>> CHISELED_BOOKSHELF_UI = REGISTRY.register("chiseled_bookshelf_ui", () -> IForgeMenuType.create(ChiseledBookshelfUIMenu::new));
}
