package net.bluephs.miocore.block;

import net.bluephs.miocore.MioCore;
import net.bluephs.miocore.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
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

public class ModOreBlocks {

    //region Normal Ores

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.Mio);

    //endregion

    //region Deepslate Ores

    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COPPER_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);

    //endregion

    //region Nether Ores

    public static final Block NETHERRACK_ARDITE_ORE = registerBlock("netherrack_ardite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);
    public static final Block NETHERRACK_OSMIUM_ORE = registerBlock("netherrack_osmium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE).strength(4.5f).requiresTool()), ModItemGroup.Mio);

    //endregion

    //region End Ores

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

    public static void registerModOreBlocks() {
        MioCore.LOGGER.info("Registering Mod Ores for " + MioCore.MOD_ID);
    }
}
