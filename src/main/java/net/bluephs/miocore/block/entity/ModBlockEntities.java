package net.bluephs.miocore.block.entity;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<MiocoreBlasterBlockEntity> MIOCORE_BLASTER;

    public static void registerAllBlockEntities(){
        MIOCORE_BLASTER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(MioCore.MOD_ID, "miocore_blaster"),
                FabricBlockEntityTypeBuilder.create(MiocoreBlasterBlockEntity::new,
                        ModBlocks.MIOCORE_BLASTER).build(null));
    }
}
