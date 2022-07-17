package net.bluephs.miocore.world.gen;

import net.bluephs.miocore.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAHAGONY_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ASH_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHERRY_TREE_PLACED.getKey().get());
    }
}
