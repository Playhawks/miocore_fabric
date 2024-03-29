package net.bluephs.miocore.registry;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItemGroup;
import net.bluephs.miocore.item.UpgradeItem;
import net.bluephs.miocore.item.UpgradeTypes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModUpgradeItems {
    // Upgrade Items
    public static final Item WOOD_COPPER_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_COPPER);
    public static final Item WOOD_IRON_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_IRON);
    public static final Item WOOD_GOLD_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_GOLD);
    public static final Item WOOD_DIAMOND_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_DIAMOND);
    public static final Item WOOD_EMERALD_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_EMERALD);
    public static final Item WOOD_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_CRYSTAL);
    public static final Item WOOD_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_OBSIDIAN);

    public static final Item COPPER_IRON_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_IRON);
    public static final Item COPPER_GOLD_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_GOLD);
    public static final Item COPPER_DIAMOND_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_DIAMOND);
    public static final Item COPPER_EMERALD_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_EMERALD);
    public static final Item COPPER_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_CRYSTAL);
    public static final Item COPPER_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.COPPER_TO_OBSIDIAN);

    public static final Item IRON_GOLD_UPGRADE = new UpgradeItem(UpgradeTypes.IRON_TO_GOLD);
    public static final Item IRON_DIAMOND_UPGRADE = new UpgradeItem(UpgradeTypes.IRON_TO_DIAMOND);
    public static final Item IRON_EMERALD_UPGRADE = new UpgradeItem(UpgradeTypes.IRON_TO_EMERALD);
    public static final Item IRON_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.IRON_TO_CRYSTAL);
    public static final Item IRON_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.IRON_TO_OBSIDIAN);

    public static final Item GOLD_DIAMOND_UPGRADE = new UpgradeItem(UpgradeTypes.GOLD_TO_DIAMOND);
    public static final Item GOLD_EMERALD_UPGRADE = new UpgradeItem(UpgradeTypes.GOLD_TO_EMERALD);
    public static final Item GOLD_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.GOLD_TO_CRYSTAL);
    public static final Item GOLD_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.GOLD_TO_OBSIDIAN);

    public static final Item DIAMOND_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.DIAMOND_TO_OBSIDIAN);
    public static final Item DIAMOND_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.DIAMOND_TO_CRYSTAL);

    public static final Item EMERALD_OBSIDIAN_UPGRADE = new UpgradeItem(UpgradeTypes.EMERALD_TO_OBSIDIAN);
    public static final Item EMERALD_CRYSTAL_UPGRADE = new UpgradeItem(UpgradeTypes.EMERALD_TO_CRYSTAL);

    public static final Item WOOD_CHRISTMAS_UPGRADE = new UpgradeItem(UpgradeTypes.WOOD_TO_CHRISTMAS);

    // Chest Items
    public static final BlockItem COPPER_CHEST = new BlockItem(ModChestBlocks.COPPER_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem IRON_CHEST = new BlockItem(ModChestBlocks.IRON_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem GOLD_CHEST = new BlockItem(ModChestBlocks.GOLD_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem DIAMOND_CHEST = new BlockItem(ModChestBlocks.DIAMOND_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem EMERALD_CHEST = new BlockItem(ModChestBlocks.EMERALD_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem CRYSTAL_CHEST = new BlockItem(ModChestBlocks.CRYSTAL_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem OBSIDIAN_CHEST = new BlockItem(ModChestBlocks.OBSIDIAN_CHEST, new Item.Settings().group(ModItemGroup.MIO));
    public static final BlockItem CHRISTMAS_CHEST = new BlockItem(ModChestBlocks.CHRISTMAS_CHEST, new Item.Settings().group(ModItemGroup.MIO));

    public static void registerItems() {
        // Item
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_copper_upgrade"), WOOD_COPPER_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_iron_upgrade"), WOOD_IRON_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_gold_upgrade"), WOOD_GOLD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_diamond_upgrade"), WOOD_DIAMOND_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_emerald_upgrade"), WOOD_EMERALD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_crystal_upgrade"), WOOD_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_obsidian_upgrade"), WOOD_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_iron_upgrade"), COPPER_IRON_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_gold_upgrade"), COPPER_GOLD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_diamond_upgrade"), COPPER_DIAMOND_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_emerald_upgrade"), COPPER_EMERALD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_crystal_upgrade"), COPPER_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_obsidian_upgrade"), COPPER_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_gold_upgrade"), IRON_GOLD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_diamond_upgrade"), IRON_DIAMOND_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_emerald_upgrade"), IRON_EMERALD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_crystal_upgrade"), IRON_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_obsidian_upgrade"), IRON_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "gold_diamond_upgrade"), GOLD_DIAMOND_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "gold_emerald_upgrade"), GOLD_EMERALD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "gold_crystal_upgrade"), GOLD_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "gold_obsidian_upgrade"), GOLD_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "diamond_crystal_upgrade"), DIAMOND_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "diamond_obsidian_upgrade"), DIAMOND_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "emerald_crystal_upgrade"), EMERALD_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "emerald_obsidian_upgrade"), EMERALD_OBSIDIAN_UPGRADE);

        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "wood_christmas_upgrade"), WOOD_CHRISTMAS_UPGRADE);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "emerald_chest"), EMERALD_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, "christmas_chest"), CHRISTMAS_CHEST);
    }
}
