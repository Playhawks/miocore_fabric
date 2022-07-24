package net.bluephs.miocore.screen;

import net.bluephs.miocore.MioCore;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModScreenHandlers {
    public static ScreenHandlerType<MiocoreBlasterScreenHandler> MIOCORE_BLASTER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers(){
        MIOCORE_BLASTER_SCREEN_HANDLER =
                Registry.register(Registry.SCREEN_HANDLER,
                        new Identifier(MioCore.MOD_ID,"miocore_blaster"),
                        new ScreenHandlerType<>(MiocoreBlasterScreenHandler::new));
    }
}
