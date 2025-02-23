package net.lancer.newsolaris;

import net.fabricmc.api.ModInitializer;

import net.lancer.newsolaris.Item.ModItemGroups;
import net.lancer.newsolaris.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewSolaris implements ModInitializer {
	public static final String MOD_ID = "new-solaris";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}