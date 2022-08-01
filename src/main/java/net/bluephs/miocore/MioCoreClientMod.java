package net.bluephs.miocore;

import net.bluephs.miocore.block.ModBlocks;
import net.bluephs.miocore.block.ModWoodStuff;
import net.bluephs.miocore.screen.MiocoreBlasterScreen;
import net.bluephs.miocore.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;

public class MioCoreClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.MAHAGONY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.MAHAGONY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.MAHAGONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.MAHAGONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.ASH_TREE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.ASH_TREE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.ASH_TREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.ASH_TREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.CHERRY_TREE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.CHERRY_TREE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.CHERRY_TREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModWoodStuff.CHERRY_TREE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIOCORE_BLASTER, RenderLayer.getCutout());

        ScreenRegistry.register(ModScreenHandlers.MIOCORE_BLASTER_SCREEN_HANDLER, MiocoreBlasterScreen::new);
    }
}
