package de.pandro.modding.minecraft.combat_cook;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombatCook implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("PorkSword");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Initializing {}!", mod.metadata().name());
		
		CombatCookItems.register(mod);
	}
}
