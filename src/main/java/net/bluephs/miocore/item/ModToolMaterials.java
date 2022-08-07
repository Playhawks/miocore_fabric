package net.bluephs.miocore.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    PLATINUMTOOL(3, 2015, 12.0F, 2.0F, 10, () -> Ingredient.ofItems(ModNuggetItems.PLATINUM_NUGGET)),
    OSMIUMTOOL(4, 4062, 15.0F, 2.0F, 15, () -> Ingredient.ofItems(ModNuggetItems.OSMIUM_NUGGET)),
    NICKEL(2, 164, 2.0F, 6.0F, 14, () -> Ingredient.ofItems(ModIngotItems.NICKEL_INGOT)),
    LEAD(2, 313, 4.0F, 9.0F, 15, () -> Ingredient.ofItems(ModIngotItems.LEAD_INGOT)),
    ALUMINIUM(2, 391, 6.0F, 12.0F, 14, () -> Ingredient.ofItems(ModIngotItems.ALUMINIUM_INGOT)),
    SILVER(3, 1951, 8.0F, 16.0F, 10, () -> Ingredient.ofItems(ModIngotItems.SILVER_INGOT)),
    PLATINUM(3, 2015, 12.0F, 20F, 10, () -> Ingredient.ofItems(ModIngotItems.PLATINUM_INGOT)),
    OSMIUM(4, 4062, 15.0F, 38.0F, 15, () -> Ingredient.ofItems(ModIngotItems.OSMIUM_INGOT));


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
