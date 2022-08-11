package net.bluephs.miocore.util;

import net.bluephs.miocore.MioCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(MioCore.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> NICKEL_INGOTS = createCommonTag("nickel_ingots");
        public static final TagKey<Item> NICKEL_NUGGETS = createCommonTag("nickel_nuggets");
        public static final TagKey<Item> RAW_NICKEL = createCommonTag("raw_nickel");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY,new Identifier(MioCore.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY,new Identifier("c", name));
        }
    }
}
