package net.bluephs.miocore.block.chestentities;

import net.bluephs.miocore.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class ObsidianChestEntity extends GenericChestEntity {
    public ObsidianChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.OBSIDIAN, pos, state);
    }
}