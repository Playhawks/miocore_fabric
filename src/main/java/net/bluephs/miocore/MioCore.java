package net.bluephs.miocore;

import net.bluephs.miocore.block.ModBlocks;
import net.bluephs.miocore.block.entity.ModBlockEntities;
import net.bluephs.miocore.item.ModItems;
import net.bluephs.miocore.recipe.ModRecipes;
import net.bluephs.miocore.screen.ModScreenHandlers;
import net.bluephs.miocore.util.ModRegistries;
import net.bluephs.miocore.world.feature.ModConfiguredFeatures;
import net.bluephs.miocore.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MioCore implements ModInitializer {
	public static  final String MOD_ID = "miocore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();

		ModScreenHandlers.registerAllScreenHandlers();
	}
}
