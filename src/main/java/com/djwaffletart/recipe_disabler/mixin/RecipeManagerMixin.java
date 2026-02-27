// Package declaration
package com.djwaffletart.recipe_disabler.mixin;

import net.minecraft.server.management.RecipeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RecipeManager.class)
public interface RecipeManagerMixin {
    @Accessor
    void recipeList(List<Recipe> recipes);

    @Accessor
    List<Recipe> recipeList();
}