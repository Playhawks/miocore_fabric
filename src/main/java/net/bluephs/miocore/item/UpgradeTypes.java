package net.bluephs.miocore.item;

import net.bluephs.miocore.block.ChestTypes;

import static net.bluephs.miocore.block.ChestTypes.*;

public enum UpgradeTypes {
    WOOD_TO_COPPER(WOOD, COPPER),
    WOOD_TO_CHRISTMAS(WOOD, CHRISTMAS),
    WOOD_TO_IRON(WOOD, IRON),
    WOOD_TO_GOLD(WOOD, GOLD),
    WOOD_TO_DIAMOND(WOOD, DIAMOND),
    WOOD_TO_EMERALD(WOOD, EMERALD),
    WOOD_TO_CRYSTAL(WOOD, CRYSTAL),
    WOOD_TO_OBSIDIAN(WOOD, OBSIDIAN),
    COPPER_TO_IRON(COPPER, IRON),
    COPPER_TO_GOLD(COPPER, GOLD),
    COPPER_TO_DIAMOND(COPPER, DIAMOND),
    COPPER_TO_EMERALD(COPPER, EMERALD),
    COPPER_TO_CRYSTAL(COPPER, CRYSTAL),
    COPPER_TO_OBSIDIAN(COPPER, OBSIDIAN),
    IRON_TO_GOLD(IRON, GOLD),
    IRON_TO_DIAMOND(IRON, DIAMOND),
    IRON_TO_EMERALD(IRON, EMERALD),
    IRON_TO_CRYSTAL(IRON, CRYSTAL),
    IRON_TO_OBSIDIAN(IRON, OBSIDIAN),
    GOLD_TO_DIAMOND(GOLD, DIAMOND),
    GOLD_TO_EMERALD(GOLD, EMERALD),
    GOLD_TO_CRYSTAL(GOLD, CRYSTAL),
    GOLD_TO_OBSIDIAN(GOLD, OBSIDIAN),
    DIAMOND_TO_CRYSTAL(DIAMOND, CRYSTAL),
    DIAMOND_TO_OBSIDIAN(DIAMOND, OBSIDIAN),
    EMERALD_TO_CRYSTAL(EMERALD, CRYSTAL),
    EMERALD_TO_OBSIDIAN(EMERALD, OBSIDIAN);

    public final ChestTypes source;
    public final ChestTypes target;

    UpgradeTypes(ChestTypes source, ChestTypes target) {
        this.source = source;
        this.target = target;
    }

    public boolean canUpgrade(ChestTypes from) {
        return from == this.source;
    }

    // Upgrade Tooltips
    public static String tooltip(UpgradeTypes type) {
        return switch (type) {
            case WOOD_TO_CHRISTMAS -> "item.miocore.wood_christmas_upgrade.tooltip";
            case WOOD_TO_COPPER -> "item.miocore.wood_copper_upgrade.tooltip";
            case WOOD_TO_IRON -> "item.miocore.wood_iron_upgrade.tooltip";
            case WOOD_TO_GOLD -> "item.miocore.wood_gold_upgrade.tooltip";
            case WOOD_TO_DIAMOND -> "item.miocore.wood_diamond_upgrade.tooltip";
            case WOOD_TO_EMERALD -> "item.miocore.wood_emerald_upgrade.tooltip";
            case WOOD_TO_CRYSTAL -> "item.miocore.wood_crystal_upgrade.tooltip";
            case WOOD_TO_OBSIDIAN -> "item.miocore.wood_obsidian_upgrade.tooltip";
            case COPPER_TO_IRON -> "item.miocore.copper_iron_upgrade.tooltip";
            case COPPER_TO_GOLD -> "item.miocore.copper_gold_upgrade.tooltip";
            case COPPER_TO_DIAMOND -> "item.miocore.copper_diamond_upgrade.tooltip";
            case COPPER_TO_EMERALD -> "item.miocore.copper_emerald_upgrade.tooltip";
            case COPPER_TO_CRYSTAL -> "item.miocore.copper_crystal_upgrade.tooltip";
            case COPPER_TO_OBSIDIAN -> "item.miocore.copper_obsidian_upgrade.tooltip";
            case IRON_TO_GOLD -> "item.miocore.iron_gold_upgrade.tooltip";
            case IRON_TO_DIAMOND -> "item.miocore.iron_diamond_upgrade.tooltip";
            case IRON_TO_EMERALD -> "item.miocore.iron_emerald_upgrade.tooltip";
            case IRON_TO_CRYSTAL -> "item.miocore.iron_crystal_upgrade.tooltip";
            case IRON_TO_OBSIDIAN -> "item.miocore.iron_obsidian_upgrade.tooltip";
            case GOLD_TO_DIAMOND -> "item.miocore.gold_diamond_upgrade.tooltip";
            case GOLD_TO_EMERALD -> "item.miocore.gold_emerald_upgrade.tooltip";
            case GOLD_TO_CRYSTAL -> "item.miocore.gold_crystal_upgrade.tooltip";
            case GOLD_TO_OBSIDIAN -> "item.miocore.gold_obsidian_upgrade.tooltip";
            case DIAMOND_TO_CRYSTAL -> "item.miocore.diamond_crystal_upgrade.tooltip";
            case DIAMOND_TO_OBSIDIAN -> "item.miocore.diamond_obsidian_upgrade.tooltip";
            case EMERALD_TO_CRYSTAL -> "item.miocore.emerald_crystal_upgrade.tooltip";
            case EMERALD_TO_OBSIDIAN -> "item.miocore.emerald_obsidian_upgrade.tooltip";
        };
    }
}
