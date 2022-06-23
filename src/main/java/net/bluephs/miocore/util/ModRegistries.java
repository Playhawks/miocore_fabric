package net.bluephs.miocore.util;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        MioCore.LOGGER.info("Registering Fuels for " + MioCore.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ENHANCED_BONE_MEAL, 200);
    }
}
