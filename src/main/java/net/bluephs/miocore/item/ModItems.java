package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
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
    public static final Item RAW_BLEI = registerItem("raw_blei",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item BLEI_INGOT = registerItem("blei_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Mio)));
    public static final Item BLEI_NUGGET = registerItem("blei_nugget",
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MioCore.LOGGER.info("Registering Mod Items for " + MioCore.MOD_ID);
    }
}
