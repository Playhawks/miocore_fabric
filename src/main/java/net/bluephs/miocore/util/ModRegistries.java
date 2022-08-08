package net.bluephs.miocore.util;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ModBlocks;
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

        instance.add(ModBlocks.MAHAGONY_LOG, 5,5);
        instance.add(ModBlocks.MAHAGONY_WOOD, 5,5);
        instance.add(ModBlocks.MAHAGONY_PLANKS, 5,20);
        instance.add(ModBlocks.MAHAGONY_LEAVES, 30,60);
        instance.add(ModBlocks.ASH_TREE_LOG, 5,5);
        instance.add(ModBlocks.ASH_TREE_WOOD, 5,5);
        instance.add(ModBlocks.ASH_TREE_PLANKS, 5,20);
        instance.add(ModBlocks.ASH_TREE_LEAVES, 30,60);
        instance.add(ModBlocks.CHERRY_TREE_LOG, 5,5);
        instance.add(ModBlocks.CHERRY_TREE_WOOD, 5,5);
        instance.add(ModBlocks.CHERRY_TREE_PLANKS, 5,20);
        instance.add(ModBlocks.CHERRY_TREE_LEAVES, 30,60);
    }
}
