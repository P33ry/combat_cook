package de.pandro.modding.minecraft.combat_cook.weapons.swords;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import de.pandro.modding.minecraft.combat_cook.tools.PorkToolMaterial;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.SwordItem;

public class CookedPorkSword extends SwordItem {

	private static final QuiltItemSettings SETTINGS = new QuiltItemSettings().food(
			new FoodComponent.Builder().hunger(16).saturationModifier(1.2F).build()
			);
	
	public CookedPorkSword() {
		super(PorkToolMaterial.PORK, 0, 4.0F, SETTINGS);
	}

}
