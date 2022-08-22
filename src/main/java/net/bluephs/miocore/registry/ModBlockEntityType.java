package net.bluephs.miocore.registry;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.chestentities.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntityType {

    // Declaring Chest Block Entities
    public static final BlockEntityType<CopperChestEntity> COPPER_CHEST = FabricBlockEntityTypeBuilder.create(CopperChestEntity::new, ModChestBlocks.COPPER_CHEST).build(null);
    public static final BlockEntityType<IronChestEntity> IRON_CHEST = FabricBlockEntityTypeBuilder.create(IronChestEntity::new, ModChestBlocks.IRON_CHEST).build(null);
    public static final BlockEntityType<GoldChestEntity> GOLD_CHEST = FabricBlockEntityTypeBuilder.create(GoldChestEntity::new, ModChestBlocks.GOLD_CHEST).build(null);
    public static final BlockEntityType<DiamondChestEntity> DIAMOND_CHEST = FabricBlockEntityTypeBuilder.create(DiamondChestEntity::new, ModChestBlocks.DIAMOND_CHEST).build(null);
    public static final BlockEntityType<EmeraldChestEntity> EMERALD_CHEST = FabricBlockEntityTypeBuilder.create(EmeraldChestEntity::new, ModChestBlocks.EMERALD_CHEST).build(null);
    public static final BlockEntityType<CrystalChestEntity> CRYSTAL_CHEST = FabricBlockEntityTypeBuilder.create(CrystalChestEntity::new, ModChestBlocks.CRYSTAL_CHEST).build(null);
    public static final BlockEntityType<ObsidianChestEntity> OBSIDIAN_CHEST = FabricBlockEntityTypeBuilder.create(ObsidianChestEntity::new, ModChestBlocks.OBSIDIAN_CHEST).build(null);
    public static final BlockEntityType<ChristmasChestEntity> CHRISTMAS_CHEST = FabricBlockEntityTypeBuilder.create(ChristmasChestEntity::new, ModChestBlocks.CHRISTMAS_CHEST).build(null);

    public static void registerBlockEntities() {
        // Registering Chest Block Entities
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "emerald_chest"), EMERALD_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MioCore.MOD_ID, "christmas_chest"), CHRISTMAS_CHEST);
    }
}
