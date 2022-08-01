package net.bluephs.miocore.world.feature;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ModBlocks;
import net.bluephs.miocore.block.ModOreBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAHAGONY_TREE =
            ConfiguredFeatures.register("mahagony_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.MAHAGONY_LOG),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.of(ModBlocks.MAHAGONY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final RegistryEntry<PlacedFeature> MAHAGONY_CHECKED =
            PlacedFeatures.register("mahagony_checked", MAHAGONY_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.MAHAGONY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAHAGONY_SPAWN =
            ConfiguredFeatures.register("mahagony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAHAGONY_CHECKED, 0.5f)),
                            MAHAGONY_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ASH_TREE =
            ConfiguredFeatures.register("ash_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ASH_TREE_LOG),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.of(ModBlocks.ASH_TREE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final RegistryEntry<PlacedFeature> ASH_TREE_CHECKED =
            PlacedFeatures.register("ash_tree_checked", ASH_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.ASH_TREE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ASH_TREE_SPAWN =
            ConfiguredFeatures.register("ash_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ASH_TREE_CHECKED, 0.5f)),
                            ASH_TREE_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE =
            ConfiguredFeatures.register("cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_TREE_LOG),
                    new StraightTrunkPlacer(5,6,3),
                    BlockStateProvider.of(ModBlocks.CHERRY_TREE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_CHECKED =
            PlacedFeatures.register("cherry_tree_checked", CHERRY_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.CHERRY_TREE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_TREE_SPAWN =
            ConfiguredFeatures.register("cherry_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_TREE_CHECKED, 0.5f)),
                            CHERRY_TREE_CHECKED));

    public static final List<OreFeatureConfig.Target> OVERWORLD_NICKEL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.NICKEL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NICKEL_ORE =
            ConfiguredFeatures.register("nickel_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_NICKEL_ORE, 10));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_NICKEL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_NICKEL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_NICKEL_ORE =
            ConfiguredFeatures.register("deepslate_nickel_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_DEEPSLATE_NICKEL_ORE, 8));

    public static final List<OreFeatureConfig.Target> OVERWORLD_LEAD_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.LEAD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> LEAD_ORE =
            ConfiguredFeatures.register("lead_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_LEAD_ORE, 8));

    public static final List<OreFeatureConfig.Target> OVERWOLD_DEEPSLATE_LEAD_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_LEAD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_LEAD_ORE =
            ConfiguredFeatures.register("deepslate_lead_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWOLD_DEEPSLATE_LEAD_ORE, 7));

    public static final List<OreFeatureConfig.Target> OVERWORLD_ALUMINIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.ALUMINIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALUMINIUM_ORE =
            ConfiguredFeatures.register("aluminium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ALUMINIUM_ORE, 7));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_ALUMINIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_ALUMINIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_ALUMINIUM_ORE =
            ConfiguredFeatures.register("deepslate_aluminium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_DEEPSLATE_ALUMINIUM_ORE, 6));

    public static final List<OreFeatureConfig.Target> OVERWORLD_PLATINUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.PLATINUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PLATINUM_ORE =
            ConfiguredFeatures.register("platinum_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_PLATINUM_ORE, 5));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_PLATINUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_PLATINUM_ORE =
            ConfiguredFeatures.register("deepslate_platinum_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_DEEPSLATE_PLATINUM_ORE, 5));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SILVER_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE =
            ConfiguredFeatures.register("silver_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SILVER_ORE, 5));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_SILVER_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_SILVER_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_SILVER_ORE =
            ConfiguredFeatures.register("deepslate_silver_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_DEEPSLATE_SILVER_ORE, 5));


    public static final List<OreFeatureConfig.Target> OVERWORLD_URANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModOreBlocks.URANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> URANIUM_ORE =
            ConfiguredFeatures.register("uranium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_URANIUM_ORE, 4));

    public static final List<OreFeatureConfig.Target> OVERWORLD_DEEPSLATE_URANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModOreBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_URANIUM_ORE =
            ConfiguredFeatures.register("deepslate_uranium_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_DEEPSLATE_URANIUM_ORE, 4));

    public static final List<OreFeatureConfig.Target> ORE_ARDITE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModOreBlocks.NETHERRACK_ARDITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ARDITE_ORE =
            ConfiguredFeatures.register("netherrack_ardite_ore", Feature.ORE,
                    new OreFeatureConfig(ORE_ARDITE, 7));

    public static final List<OreFeatureConfig.Target> ORE_OSMIUM = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModOreBlocks.NETHERRACK_OSMIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OSMIUM_ORE =
            ConfiguredFeatures.register("netherrack_osmium_ore", Feature.ORE,
                    new OreFeatureConfig(ORE_OSMIUM, 8));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + MioCore.MOD_ID);
    }
}