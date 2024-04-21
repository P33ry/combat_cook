package de.pandro.modding.minecraft.combat_cook.weapons.swords;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import de.pandro.modding.minecraft.combat_cook.tools.PorkToolMaterial;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.SwordItem;

public class PorkSword extends SwordItem {

	private static final QuiltItemSettings SETTINGS = new QuiltItemSettings().food(
			new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build()
			);
	
	public PorkSword() {
		super(PorkToolMaterial.PORK, 3, 1.6F, SETTINGS);
	}

}
