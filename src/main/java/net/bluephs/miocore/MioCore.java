package net.bluephs.miocore;

import net.bluephs.miocore.block.ModBlocks;
import net.bluephs.miocore.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MioCore implements ModInitializer {
	public static  final String MOD_ID = "miocore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
