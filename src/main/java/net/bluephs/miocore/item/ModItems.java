package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_NICKEL = registerItem("raw_nickel",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_LEAD = registerItem("raw_lead",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_PLATIN = registerItem("raw_platin",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item PLATIN_INGOT = registerItem("platin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item PLATIN_NUGGET = registerItem("platin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_ARDITE = registerItem("raw_ardite",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ARDITE_INGOT = registerItem("ardite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ARDITE_NUGGET = registerItem("ardite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_OSMIUM = registerItem("raw_osmium",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item RAW_URAN = registerItem("raw_uran",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item URAN_INGOT = registerItem("uran_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ENHANCED_BONE_MEAL = registerItem("enhanced_bone_meal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.Mio).maxDamage(1250)));

    public static final Item MAHAGONY_COAL = registerItem("mahagony_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item ASH_TREE_COAL = registerItem("ash_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item CHERRY_TREE_COAL = registerItem("cherry_tree_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MioCore.LOGGER.info("Registering Mod Items for " + MioCore.MOD_ID);
    }
}
