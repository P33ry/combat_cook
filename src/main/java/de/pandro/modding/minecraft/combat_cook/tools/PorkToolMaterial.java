package de.pandro.modding.minecraft.combat_cook.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PorkToolMaterial implements ToolMaterial {
	
	public static final PorkToolMaterial PORK = new PorkToolMaterial();
	
	@Override
	public int getDurability() {
		return 500;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		// TODO Auto-generated method stub
		return 2.0F;
	}

	@Override
	public float getAttackDamage() {
		return 1.0F;
	}

	@Override
	public int getMiningLevel() {
		return 1;
	}

	@Override
	public int getEnchantability() {
		return 5;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.PORKCHOP);
	}

}
