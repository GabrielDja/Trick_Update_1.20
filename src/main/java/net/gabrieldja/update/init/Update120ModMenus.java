
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gabrieldja.update.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.gabrieldja.update.world.inventory.ChiseledBookshelfUIMenu;
import net.gabrieldja.update.Update120Mod;

public class Update120ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Update120Mod.MODID);
	public static final RegistryObject<MenuType<ChiseledBookshelfUIMenu>> CHISELED_BOOKSHELF_UI = REGISTRY.register("chiseled_bookshelf_ui",
			() -> IForgeMenuType.create(ChiseledBookshelfUIMenu::new));
}
