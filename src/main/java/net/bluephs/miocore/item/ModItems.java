package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //region Ingot Items

    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item ARDITE_INGOT = registerItem("ardite_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Raw Items

    public static final Item RAW_NICKEL = registerItem("raw_nickel",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item RAW_LEAD = registerItem("raw_lead",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item RAW_ARDITE = registerItem("raw_ardite",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item RAW_OSMIUM = registerItem("raw_osmium",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Nugget Items

    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item ARDITE_NUGGET = registerItem("ardite_nugget",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    //endregion

    //region Swords

    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new SwordItem(ModToolMaterials.NICKEL, 1, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.MIO)));

    public static final Item LEAD_SWORD = registerItem("lead_sword",
            new SwordItem(ModToolMaterials.LEAD, 1, -2f,
                    new FabricItemSettings().group(ModItemGroup.MIO)));

    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterials.ALUMINIUM, 1, -1f,
                    new FabricItemSettings().group(ModItemGroup.MIO)));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterials.SILVER, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.MIO)));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATINUM, 1, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_SWORD = registerItem("osmium_sword",
            new SwordItem(ModToolMaterials.OSMIUM, 1, 2f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Bow Items

    public static final Item OSMIUM_BOW = registerItem("osmium_bow",
            new BowItem(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO).maxDamage(4062)));

    //endregion

    //region Tools

    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new ModAxeItem(ModToolMaterials.PLATINUM, 3, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new ModHoeItem(ModToolMaterials.PLATINUM, 0,0f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, 1, 2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PLATINUM, 1, 2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));


    public static final Item OSMIUM_AXE = registerItem("osmium_axe",
            new ModAxeItem(ModToolMaterials.OSMIUM, 3, 1f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_HOE = registerItem("osmium_hoe",
            new ModHoeItem(ModToolMaterials.OSMIUM, 0, 0f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_SHOVEL = registerItem("osmium_shovel",
            new ShovelItem(ModToolMaterials.OSMIUM, 0, 1f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_PICKAXE = registerItem("osmium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OSMIUM, 1, 2f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Paxel Items

    public static final Item DIAMOND_PAXEL = registerItem("diamond_paxel",
            new ModPaxelItem(ModToolMaterials.DIAMONDPAXEL, 1, 1f,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MIO)));

    public static final Item PLATINUM_PAXEL = registerItem("platinum_paxel",
            new ModPaxelItem(ModToolMaterials.PLATINUMPAXEL, 1, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_PAXEL = registerItem("osmium_paxel",
            new ModPaxelItem(ModToolMaterials.OSMIUMPAXEL, 1, 1f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Armor Items

    public static final Item ALUMINIUM_HELMET = registerItem("aluminium_helmet",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MIO)));
    public static final Item ALUMINIUM_CHESTPLATE = registerItem("aluminium_chestplate",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MIO)));
    public static final Item ALUMINIUM_LEGGINGS = registerItem("aluminium_leggings",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MIO)));
    public static final Item ALUMINIUM_BOOTS = registerItem("aluminium_boots",
            new ArmorItem(ModArmorMaterials.ALUMINIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.MIO)));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));

    public static final Item OSMIUM_HELMET = registerItem("osmium_helmet",
            new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));
    public static final Item OSMIUM_CHESTPLATE = registerItem("osmium_chestplate",
            new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));
    public static final Item OSMIUM_LEGGINGS = registerItem("osmium_leggings",
            new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));
    public static final Item OSMIUM_BOOTS = registerItem("osmium_boots",
            new ArmorItem(ModArmorMaterials.OSMIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    //region Special Items

    public static final Item ENHANCED_BONE_MEAL = registerItem("enhanced_bone_meal",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO).maxDamage(1250)));

    //endregion

    //region Fuels

    public static final Item MAHAGONY_COAL = registerItem("mahagony_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item ASH_TREE_COAL = registerItem("ash_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));
    public static final Item CHERRY_TREE_COAL = registerItem("cherry_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.MIO)));

    //endregion


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MioCore.LOGGER.info("Registering Mod Items for " + MioCore.MOD_ID);
    }
}
