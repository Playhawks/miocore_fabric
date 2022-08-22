package net.bluephs.miocore.block.chestentities;

import net.bluephs.miocore.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class IronChestEntity extends GenericChestEntity {
    public IronChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.IRON, pos, state);
    }
}
