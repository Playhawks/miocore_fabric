package net.bluephs.miocore.registry;

import net.bluephs.miocore.block.ChestTypes;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;

public class ModTextures {
    public static void registerTextures() {
        ClientSpriteRegistryCallback.event(TexturedRenderLayers.CHEST_ATLAS_TEXTURE).register((texture, registry) -> {
            registry.register(ChestTypes.WOOD.texture);
            registry.register(ChestTypes.COPPER.texture);
            registry.register(ChestTypes.IRON.texture);
            registry.register(ChestTypes.GOLD.texture);
            registry.register(ChestTypes.DIAMOND.texture);
            registry.register(ChestTypes.EMERALD.texture);
            registry.register(ChestTypes.CRYSTAL.texture);
            registry.register(ChestTypes.OBSIDIAN.texture);
            registry.register(ChestTypes.CHRISTMAS.texture);
        });
    }
}
