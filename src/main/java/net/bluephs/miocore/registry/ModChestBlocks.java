package net.bluephs.miocore.registry;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ChestTypes;
import net.bluephs.miocore.block.CrystalChestBlock;
import net.bluephs.miocore.block.GenericChestBlock;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModChestBlocks {
    public static final Block COPPER_CHEST = new GenericChestBlock(ChestTypes.COPPER.setting(), ChestTypes.COPPER);
    public static final Block IRON_CHEST = new GenericChestBlock(ChestTypes.IRON.setting(), ChestTypes.IRON);
    public static final Block GOLD_CHEST = new GenericChestBlock(ChestTypes.GOLD.setting(), ChestTypes.GOLD);
    public static final Block DIAMOND_CHEST = new GenericChestBlock(ChestTypes.DIAMOND.setting(), ChestTypes.DIAMOND);
    public static final Block EMERALD_CHEST = new GenericChestBlock(ChestTypes.EMERALD.setting(), ChestTypes.EMERALD);
    public static final Block CRYSTAL_CHEST = new CrystalChestBlock();
    public static final Block OBSIDIAN_CHEST = new GenericChestBlock(ChestTypes.OBSIDIAN.setting(), ChestTypes.OBSIDIAN);
    public static final Block CHRISTMAS_CHEST = new GenericChestBlock(ChestTypes.CHRISTMAS.setting(), ChestTypes.CHRISTMAS);

    public static void registerChestBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "emerald_chest"), EMERALD_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, "christmas_chest"), CHRISTMAS_CHEST);
    }
}
