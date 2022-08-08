package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

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
