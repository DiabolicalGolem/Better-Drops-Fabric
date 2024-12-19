package net.betterdrops;

import net.fabricmc.api.ModInitializer;

import net.betterdrops.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterDrops implements ModInitializer {
	public static final String MOD_ID = "betterdrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}