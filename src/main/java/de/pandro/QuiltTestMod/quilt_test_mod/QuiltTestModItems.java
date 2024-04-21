package de.pandro.QuiltTestMod.quilt_test_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class QuiltTestModItems {
	public static final Item EXAMPLE_ITEM = new Item(new QuiltItemSettings());
	
	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "example_item"), EXAMPLE_ITEM);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(EXAMPLE_ITEM);
		});
		//Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "example_item"), EXAMPLE_ITEM);
	}
}