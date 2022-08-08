package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModIngotItems {

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
        }

    public static void registerModIngotItems() {
        MioCore.LOGGER.info("Registering Mod Ingots for " + MioCore.MOD_ID);
    }
}
