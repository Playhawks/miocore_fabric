package net.bluephs.miocore.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    NICKEL(2, 164, 8.0F, 6.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.NICKEL_INGOT});
    }),
    LEAD(2, 313, 8.0F, 9.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.LEAD_INGOT});
    }),
    ALUMINIUM(2, 391, 8.0F, 12.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.ALUMINIUM_INGOT});
    }),
    SILVER(3, 1951, 12.0F, 16.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.SILVER_INGOT});
    }),
    PLATIN(3, 2015, 12.0F, 20F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.PLATINUM_INGOT});
    }),
    OSMIUM(4, 4062, 15.0F, 38.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.OSMIUM_INGOT});
    }),
    PLATIN_TOOL(3, 2015, 12.0F, -1.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.PLATINUM_INGOT});
    }),
    OSMIUM_TOOL(4, 4062, 15.0F, -1.0F, 24, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModIngotItems.OSMIUM_INGOT});
    });

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
