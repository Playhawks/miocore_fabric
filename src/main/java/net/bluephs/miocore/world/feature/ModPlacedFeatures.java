package net.bluephs.miocore.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> MAHAGONY_PLACED =
            PlacedFeatures.register("mahagony_placed",
                    ModConfiguredFeatures.MAHAGONY_SPAWN, VegetationPlacedFeatures.modifiers(
                            PlacedFeatures.createCountExtraModifier(1,0.1f,1)
                    ));
}
