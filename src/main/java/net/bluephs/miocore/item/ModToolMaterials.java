package net.bluephs.miocore.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    NICKEL(MiningLevels.IRON, 164, 2.0F, 6.0F, 14, () -> Ingredient.ofItems(ModIngotItems.NICKEL_INGOT)),
    LEAD(MiningLevels.IRON, 313, 4.0F, 9.0F, 15, () -> Ingredient.ofItems(ModIngotItems.LEAD_INGOT)),
    ALUMINIUM(MiningLevels.IRON, 391, 6.0F, 12.0F, 14, () -> Ingredient.ofItems(ModIngotItems.ALUMINIUM_INGOT)),
    SILVER(MiningLevels.DIAMOND, 1951, 8.0F, 16.0F, 10, () -> Ingredient.ofItems(ModIngotItems.SILVER_INGOT)),
    PLATINUM(MiningLevels.DIAMOND, 2015, 12.0F, 20F, 10, () -> Ingredient.ofItems(ModIngotItems.PLATINUM_INGOT)),
    OSMIUM(MiningLevels.NETHERITE, 4062, 15.0F, 9.0F, 15, () -> Ingredient.ofItems(ModIngotItems.OSMIUM_INGOT)),
    PLATINUMTOOL(MiningLevels.DIAMOND, 2015, 12.0F, 2.0F, 10, () -> Ingredient.ofItems(ModNuggetItems.PLATINUM_NUGGET)),
    OSMIUMTOOL(MiningLevels.NETHERITE, 4062, 15.0F, 2.0F, 15, () -> Ingredient.ofItems(ModNuggetItems.OSMIUM_NUGGET));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
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
