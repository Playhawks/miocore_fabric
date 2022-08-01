package net.bluephs.miocore.item;

import net.bluephs.miocore.MioCore;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Mio = FabricItemGroupBuilder.build(new Identifier(MioCore.MOD_ID, "mio"),
            () -> new ItemStack(ModIngotItems.PLATINUM_INGOT));
}
