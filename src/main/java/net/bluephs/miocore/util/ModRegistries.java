package net.bluephs.miocore.util;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ModWoodStuff;
import net.bluephs.miocore.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
        registerFlammableBlock();
    }

    private static void registerFuels(){
        MioCore.LOGGER.info("Registering Fuels for " + MioCore.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.MAHAGONY_COAL, 3200);
        registry.add(ModItems.ASH_TREE_COAL, 3200);
        registry.add(ModItems.CHERRY_TREE_COAL, 3200);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModWoodStuff.MAHAGONY_LOG, 5,5);
        instance.add(ModWoodStuff.MAHAGONY_WOOD, 5,5);
        instance.add(ModWoodStuff.MAHAGONY_PLANKS, 5,20);
        instance.add(ModWoodStuff.MAHAGONY_LEAVES, 30,60);
        instance.add(ModWoodStuff.ASH_TREE_LOG, 5,5);
        instance.add(ModWoodStuff.ASH_TREE_WOOD, 5,5);
        instance.add(ModWoodStuff.ASH_TREE_PLANKS, 5,20);
        instance.add(ModWoodStuff.ASH_TREE_LEAVES, 30,60);
        instance.add(ModWoodStuff.CHERRY_TREE_LOG, 5,5);
        instance.add(ModWoodStuff.CHERRY_TREE_WOOD, 5,5);
        instance.add(ModWoodStuff.CHERRY_TREE_PLANKS, 5,20);
        instance.add(ModWoodStuff.CHERRY_TREE_LEAVES, 30,60);
    }
}
