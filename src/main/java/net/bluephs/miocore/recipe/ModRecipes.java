package net.bluephs.miocore.recipe;

import net.bluephs.miocore.MioCore;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MioCore.MOD_ID, MiocoreBlasterRecipe.Serializer.ID),
                MiocoreBlasterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(MioCore.MOD_ID, MiocoreBlasterRecipe.Type.ID),
                MiocoreBlasterRecipe.Type.INSTANCE);
    }
}
