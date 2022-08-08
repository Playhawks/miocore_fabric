package net.bluephs.miocore.item.tools;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModSwordItems {
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModSwordItems() {
        MioCore.LOGGER.info("Registering Mod Sword Items for " + MioCore.MOD_ID);
    }
}
