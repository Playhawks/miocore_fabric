package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.custom.DowsingRodItem;
import net.bluephs.miocore.item.custom.ModAxeItem;
import net.bluephs.miocore.item.custom.ModHoeItem;
import net.bluephs.miocore.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //region Special Items

    public static final Item ENHANCED_BONE_MEAL = registerItem("enhanced_bone_meal",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.Mio)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.Mio).maxDamage(1250)));

    //endregion

    //region Tools

    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATIN, 0, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new ModAxeItem(ModToolMaterials.PLATIN, 3, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new ModHoeItem(ModToolMaterials.PLATIN, 0, 0f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PLATIN, 1, 0,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));

    public static final Item OSMIUM_SHOVEL = registerItem("osmium_shovel",
            new ShovelItem(ModToolMaterials.OSMIUM, 0, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item OSMIUM_AXE = registerItem("osmium_axe",
            new ModAxeItem(ModToolMaterials.OSMIUM, 3, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item OSMIUM_HOE = registerItem("osmium_hoe",
            new ModHoeItem(ModToolMaterials.OSMIUM, 0, 0f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));
    public static final Item OSMIUM_PICKAXE = registerItem("osmium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OSMIUM, 1, 0,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.Mio)));

    //endregion

    //region Swords

    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new SwordItem(ModToolMaterials.NICKEL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item LEAD_SWORD = registerItem("lead_sword",
            new SwordItem(ModToolMaterials.LEAD, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterials.ALUMINIUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterials.SILVER, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATIN, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item OSMIUM_SWORD = registerItem("osmium_sword",
            new SwordItem(ModToolMaterials.OSMIUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.Mio)));

    //endregion

    //region Fuels

    public static final Item MAHAGONY_COAL = registerItem("mahagony_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ASH_TREE_COAL = registerItem("ash_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item CHERRY_TREE_COAL = registerItem("cherry_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    //endregion


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MioCore.LOGGER.info("Registering Mod Items for " + MioCore.MOD_ID);
    }
}
