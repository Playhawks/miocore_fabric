package net.bluephs.miocore.block.chestentities;

import net.bluephs.miocore.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class EmeraldChestEntity extends GenericChestEntity {
    public EmeraldChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.EMERALD, pos, state);
    }
}
