package net.bluephs.miocore;

import net.bluephs.miocore.block.ModBlocks;
import net.bluephs.miocore.block.ModOreBlocks;
import net.bluephs.miocore.block.ModWoodStuff;
import net.bluephs.miocore.block.entity.ModBlockEntities;
import net.bluephs.miocore.item.*;
import net.bluephs.miocore.item.tools.ModSwordItems;
import net.bluephs.miocore.item.tools.ModToolItems;
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

		ModIngotItems.registerModIngotItems();
		ModSwordItems.registerModSwordItems();
		ModToolItems.registerModToolItems();
		ModNuggetItems.registerModNuggetItems();
		ModRawItems.registerModRawItems();
		ModItems.registerModItems();
		ModFluidItems.registerModFluidItems();
		ModOreBlocks.registerModOreBlocks();
		ModBlocks.registerModBlocks();
		ModWoodStuff.registerModWoodStuff();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();

		ModScreenHandlers.registerAllScreenHandlers();
	}
}
