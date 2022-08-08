package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModRawItems {

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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModRawItems() {
        MioCore.LOGGER.info("Registering Mod Raw Items for " + MioCore.MOD_ID);
    }
}
