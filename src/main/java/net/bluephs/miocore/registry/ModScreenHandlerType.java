package net.bluephs.miocore.registry;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.block.ChestTypes;
import net.bluephs.miocore.screen.ChestScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlerType {

    public static ScreenHandlerType<ChestScreenHandler> COPPER_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> IRON_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> GOLD_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> DIAMOND_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> EMERALD_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> CRYSTAL_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> OBSIDIAN_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> CHRISTMAS_CHEST;


    public static void registerScreenHandlerType() {
        COPPER_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "copper_chest"), (syncId, inventory) -> new ChestScreenHandler(COPPER_CHEST, ChestTypes.COPPER, syncId, inventory, ScreenHandlerContext.EMPTY));
        IRON_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "iron_chest"), (syncId, inventory) -> new ChestScreenHandler(IRON_CHEST, ChestTypes.IRON, syncId, inventory, ScreenHandlerContext.EMPTY));
        GOLD_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "gold_chest"), (syncId, inventory) -> new ChestScreenHandler(GOLD_CHEST, ChestTypes.GOLD, syncId, inventory, ScreenHandlerContext.EMPTY));
        DIAMOND_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "diamond_chest"), (syncId, inventory) -> new ChestScreenHandler(DIAMOND_CHEST, ChestTypes.DIAMOND, syncId, inventory, ScreenHandlerContext.EMPTY));
        EMERALD_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "emerald_chest"), (syncId, inventory) -> new ChestScreenHandler(EMERALD_CHEST, ChestTypes.EMERALD, syncId, inventory, ScreenHandlerContext.EMPTY));
        CRYSTAL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "crystal_chest"), (syncId, inventory) -> new ChestScreenHandler(CRYSTAL_CHEST, ChestTypes.CRYSTAL, syncId, inventory, ScreenHandlerContext.EMPTY));
        OBSIDIAN_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "obsidian_chest"), (syncId, inventory) -> new ChestScreenHandler(OBSIDIAN_CHEST, ChestTypes.OBSIDIAN, syncId, inventory, ScreenHandlerContext.EMPTY));
        CHRISTMAS_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(MioCore.MOD_ID, "christmas_chest"), (syncId, inventory) -> new ChestScreenHandler(CHRISTMAS_CHEST, ChestTypes.CHRISTMAS, syncId, inventory, ScreenHandlerContext.EMPTY));
    }
}
