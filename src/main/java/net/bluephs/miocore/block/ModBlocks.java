package net.bluephs.miocore.block;

import net.bluephs.miocore.block.custon.*;
import net.bluephs.miocore.world.feature.tree.AshTreeSaplingGenerator;
import net.bluephs.miocore.world.feature.tree.CherryTreeSaplingGenerator;
import net.bluephs.miocore.world.feature.tree.MahagonySaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    //region Normal Ores

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);

    //endregion

    //region Deepslate Ores

    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.MIO);

    //endregion

    //region Nether Ores

    public static final Block NETHERRACK_ARDITE_ORE = registerBlock("netherrack_ardite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block NETHERRACK_OSMIUM_ORE = registerBlock("netherrack_osmium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MIO);

    //endregion

    //region End Ores

    //endregion

    //region Blocks

    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block ARDITE_BLOCK = registerBlock("ardite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MIO);

    //endregion

    //region Mahagony Stuff

    public static final Block MAHAGONY_BUTTON = registerBlock("mahagony_button",
            new ModWoodButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().noCollision()), ModItemGroup.MIO);
    public static final Block MAHAGONY_FENCE = registerBlock("mahagony_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_FENCE_GATE = registerBlock("mahagony_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_SLAB = registerBlock("mahagony_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_PLANKS = registerBlock("mahagony_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_STAIRS = registerBlock("mahagony_stairs",
            new ModStairsBlock(ModBlocks.MAHAGONY_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_LOG = registerBlock("mahagony_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_WOOD = registerBlock("mahagony_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block MAHAGONY_DOOR = registerBlock("mahagony_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block MAHAGONY_TRAPDOOR = registerBlock("mahagony_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block MAHAGONY_LEAVES = registerBlock("mahagony_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.LICHEN_GREEN).nonOpaque()), ModItemGroup.MIO);
    public static final Block MAHAGONY_SAPLING = registerBlock("mahagony_sapling",
            new ModSaplingBlock(new MahagonySaplingGenerator(),FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.MIO);

    //endregion

    //region Ash Tree Stuff

    public static final Block ASH_TREE_BUTTON = registerBlock("ash_tree_button",
            new ModWoodButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().noCollision()), ModItemGroup.MIO);
    public static final Block ASH_TREE_FENCE = registerBlock("ash_tree_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_FENCE_GATE = registerBlock("ash_tree_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_SLAB = registerBlock("ash_tree_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_PLANKS = registerBlock("ash_tree_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_STAIRS = registerBlock("ash_tree_stairs",
            new ModStairsBlock(ModBlocks.ASH_TREE_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_LOG = registerBlock("ash_tree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_WOOD = registerBlock("ash_tree_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block ASH_TREE_DOOR = registerBlock("ash_tree_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block ASH_TREE_TRAPDOOR = registerBlock("ash_tree_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block ASH_TREE_LEAVES = registerBlock("ash_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.LIME).nonOpaque()), ModItemGroup.MIO);
    public static final Block ASH_TREE_SAPLING = registerBlock("ash_tree_sapling",
            new ModSaplingBlock(new AshTreeSaplingGenerator(),FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.MIO);

    //endregion

    //region Cherry Tree

    public static final Block CHERRY_TREE_BUTTON = registerBlock("cherry_tree_button",
            new ModWoodButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().noCollision()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_FENCE = registerBlock("cherry_tree_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_FENCE_GATE = registerBlock("cherry_tree_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_SLAB = registerBlock("cherry_tree_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_PLANKS = registerBlock("cherry_tree_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_STAIRS = registerBlock("cherry_tree_stairs",
            new ModStairsBlock(ModBlocks.CHERRY_TREE_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_LOG = registerBlock("cherry_tree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_WOOD = registerBlock("cherry_tree_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.5f).requiresTool()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_DOOR = registerBlock("cherry_tree_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_TRAPDOOR = registerBlock("cherry_tree_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).requiresTool().nonOpaque()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_LEAVES = registerBlock("cherry_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.MAGENTA).nonOpaque()), ModItemGroup.MIO);
    public static final Block CHERRY_TREE_SAPLING = registerBlock("cherry_tree_sapling",
            new ModSaplingBlock(new CherryTreeSaplingGenerator(),FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.MIO);

    //endregion

    //region Special Blocks

    public static final Block MIOCORE_BLASTER = registerBlock("miocore_blaster",
            new MiocoreBlasterBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()), ModItemGroup.MIO);

    //endregion


    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey){
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MioCore.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Registry.register(Registry.ITEM, new Identifier(MioCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MioCore.LOGGER.info("Registering Mod Blocks for " + MioCore.MOD_ID);
    }
}
