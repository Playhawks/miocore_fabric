package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModNuggetItems {

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModNuggetItems() {
        MioCore.LOGGER.info("Registering Mod Nuggets for " + MioCore.MOD_ID);
    }
}
