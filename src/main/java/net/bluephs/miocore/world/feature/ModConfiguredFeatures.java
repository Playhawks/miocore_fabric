package net.bluephs.miocore.world.feature;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ModBlocks;
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

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + MioCore.MOD_ID);
    }
}
