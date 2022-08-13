package net.bluephs.miocore.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    NICKEL(MiningLevels.IRON, 164, 6.0f, 6.0f, 10, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    LEAD(MiningLevels.IRON, 313, 6.0f, 9.0f, 10, () -> Ingredient.ofItems(ModItems.LEAD_INGOT)),
    ALUMINIUM(MiningLevels.IRON, 391, 6.0f, 12.0f, 19, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT)),
    SILVER(MiningLevels.DIAMOND, 1951, 8.0f, 16.0f, 14, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    PLATINUM(MiningLevels.DIAMOND, 2015, 8.0f, 20f, 14, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    OSMIUM(MiningLevels.NETHERITE, 4062, 9.0f, 38.0f, 15, () -> Ingredient.ofItems(ModItems.OSMIUM_INGOT)),
    DIAMONDPAXEL(MiningLevels.DIAMOND, 2341, 9.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    PLATINUMPAXEL(MiningLevels.DIAMOND, 3022, 10.0F, 20.0F, 14, () -> Ingredient.ofItems(Items.DIAMOND)),
    OSMIUMPAXEL(MiningLevels.DIAMOND, 6093, 11.0F, 38.0F, 15, () -> Ingredient.ofItems(Items.DIAMOND));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
