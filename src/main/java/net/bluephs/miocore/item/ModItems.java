package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_NICKEL = registerItem("raw_nickel",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MioCore.LOGGER.info("Registering Mod Items for " + MioCore.MOD_ID);
    }
}
