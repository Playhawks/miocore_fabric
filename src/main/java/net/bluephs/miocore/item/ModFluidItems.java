package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluidItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name), item);
    }

    public static void registerModFluidItems() {
        MioCore.LOGGER.info("Registering Mod Fluid Items for " + MioCore.MOD_ID);
    }
}
