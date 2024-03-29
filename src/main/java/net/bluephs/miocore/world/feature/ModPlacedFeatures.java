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
            ModConfiguredFeatures.NICKEL_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(109), YOffset.aboveBottom(129))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_NICKEL_ORE_PLACED = PlacedFeatures.register("deepslate_nickel_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_NICKEL_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> LEAD_ORE_PLACED = PlacedFeatures.register("lead_ore_placed",
            ModConfiguredFeatures.LEAD_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(89), YOffset.aboveBottom(109))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_LEAD_ORE_PLACED = PlacedFeatures.register("deepslate_lead_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_LEAD_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> ALUMINIUM_ORE_PLACED = PlacedFeatures.register("aluminium_ore_placed",
            ModConfiguredFeatures.ALUMINIUM_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(79), YOffset.aboveBottom(89))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_ALUMINIUM_ORE_PLACED = PlacedFeatures.register("deepslate_aluminium_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_ALUMINIUM_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> PLATINUM_ORE_PLACED = PlacedFeatures.register("platinum_ore_placed",
            ModConfiguredFeatures.PLATINUM_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(79), YOffset.aboveBottom(99))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_PLATINUM_ORE_PLACED = PlacedFeatures.register("deepslate_platinum_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_PLATINUM_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(89), YOffset.aboveBottom(99))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_SILVER_ORE_PLACED = PlacedFeatures.register("deepslate_silver_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_SILVER_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> URANIUM_ORE_PLACED = PlacedFeatures.register("uranium_ore_placed",
            ModConfiguredFeatures.URANIUM_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(74), YOffset.aboveBottom(79))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_URANIUM_ORE_PLACED = PlacedFeatures.register("deepslate_uranium_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_URANIUM_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.aboveBottom(72))));

    public static final RegistryEntry<PlacedFeature> ARDITE_ORE_PLACED = PlacedFeatures.register("ardite_ore_placed",
            ModConfiguredFeatures.ARDITE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(25), YOffset.aboveBottom(45))));

    public static final RegistryEntry<PlacedFeature> OSMIUM_ORE_PLACED = PlacedFeatures.register("osmium_ore_placed",
            ModConfiguredFeatures.OSMIUM_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(35), YOffset.aboveBottom(60))));
}