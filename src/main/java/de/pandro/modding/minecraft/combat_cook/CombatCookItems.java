package de.pandro.modding.minecraft.combat_cook;

import org.quiltmc.loader.api.ModContainer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import de.pandro.modding.minecraft.combat_cook.weapons.swords.CookedPorkSword;
import de.pandro.modding.minecraft.combat_cook.weapons.swords.PorkSword;

public class CombatCookItems {
	
	public static final Item PORK_SWORD = new PorkSword();
	public static final Item COOKED_PORK_SWORD = new CookedPorkSword();
	
	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "pork_sword"), PORK_SWORD);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "cooked_pork_sword"), COOKED_PORK_SWORD);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
			entries.addItem(PORK_SWORD);
			entries.addItem(COOKED_PORK_SWORD);
		});
		//Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "example_item"), EXAMPLE_ITEM);
	}
}
