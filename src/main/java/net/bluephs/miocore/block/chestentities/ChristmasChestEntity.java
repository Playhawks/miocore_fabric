package net.bluephs.miocore.block.chestentities;

import net.bluephs.miocore.block.ChestTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class ChristmasChestEntity extends GenericChestEntity {
    public ChristmasChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.CHRISTMAS, pos, state);
    }
}
