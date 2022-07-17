package net.bluephs.miocore.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> MAHAGONY_PLACED =
            PlacedFeatures.register("mahagony_placed",
                    ModConfiguredFeatures.MAHAGONY_SPAWN, VegetationPlacedFeatures.modifiers(
                            PlacedFeatures.createCountExtraModifier(1,0.1f,1)
                    ));
    public static final RegistryEntry<PlacedFeature> ASH_TREE_PLACED =
            PlacedFeatures.register("ash_tree_placed",
                    ModConfiguredFeatures.ASH_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                            PlacedFeatures.createCountExtraModifier(1,0.1f,1)
                    ));
    public static final RegistryEntry<PlacedFeature> CHERRY_TREE_PLACED =
            PlacedFeatures.register("cherry_tree_placed",
                    ModConfiguredFeatures.CHERRY_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                            PlacedFeatures.createCountExtraModifier(1,0.1f,1)
                    ));

    public static final RegistryEntry<PlacedFeature> NICKEL_ORE_PLACED = PlacedFeatures.register("nickel_ore_placed",
            ModConfiguredFeatures.NICKEL_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(139), YOffset.aboveBottom(159))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_NICKEL_ORE_PLACED = PlacedFeatures.register("deepslate_nickel_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_NICKEL_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> LEAD_ORE_PLACED = PlacedFeatures.register("lead_ore_placed",
            ModConfiguredFeatures.LEAD_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(119), YOffset.aboveBottom(139))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_LEAD_ORE_PLACED = PlacedFeatures.register("deepslate_lead_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_LEAD_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> ALUMINIUM_ORE_PLACED = PlacedFeatures.register("aluminium_ore_placed",
            ModConfiguredFeatures.ALUMINIUM_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(79), YOffset.aboveBottom(89))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_ALUMINIUM_ORE_PLACED = PlacedFeatures.register("deepslate_aluminium_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_ALUMINIUM_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> PLATIN_ORE_PLACED = PlacedFeatures.register("platin_ore_placed",
            ModConfiguredFeatures.PLATIN_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(79), YOffset.aboveBottom(99))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_PLATIN_ORE_PLACED = PlacedFeatures.register("deepslate_platin_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_PLATIN_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(89), YOffset.aboveBottom(99))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_SILVER_ORE_PLACED = PlacedFeatures.register("deepslate_silver_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_SILVER_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> URAN_ORE_PLACED = PlacedFeatures.register("uran_ore_placed",
            ModConfiguredFeatures.URAN_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(74), YOffset.aboveBottom(79))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_URAN_ORE_PLACED = PlacedFeatures.register("deepslate_uran_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_URAN_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> ARDITE_ORE_PLACED = PlacedFeatures.register("ardite_ore_placed",
            ModConfiguredFeatures.ARDITE_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(25), YOffset.aboveBottom(45))));

    public static final RegistryEntry<PlacedFeature> OSMIUM_ORE_PLACED = PlacedFeatures.register("osmium_ore_placed",
            ModConfiguredFeatures.OSMIUM_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(35), YOffset.aboveBottom(60))));
}
