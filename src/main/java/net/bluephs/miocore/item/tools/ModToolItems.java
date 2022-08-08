package net.bluephs.miocore.item.tools;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItemGroup;
import net.bluephs.miocore.item.tools.custom.ModAxeItem;
import net.bluephs.miocore.item.tools.custom.ModHoeItem;
import net.bluephs.miocore.item.tools.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModToolItems {

    //region Tools

    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new ModAxeItem(ModToolMaterials.PLATINUM, 3, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new ModHoeItem(ModToolMaterials.PLATINUM, 0,0f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, 0, 1f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MIO)));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new ModPickaxeItem(ModToolMaterials.PLATINUM, 1, 0f,
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
            new ModPickaxeItem(ModToolMaterials.OSMIUM, 1, 0f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.MIO)));

    //endregion

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModToolItems() {
        MioCore.LOGGER.info("Registering Mod Tool Items for " + MioCore.MOD_ID);
    }
}
