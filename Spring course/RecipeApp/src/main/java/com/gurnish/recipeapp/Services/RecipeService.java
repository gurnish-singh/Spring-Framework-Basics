package com.gurnish.recipeapp.Services;

import com.gurnish.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
