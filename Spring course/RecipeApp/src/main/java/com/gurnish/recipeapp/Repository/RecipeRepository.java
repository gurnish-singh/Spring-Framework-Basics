package com.gurnish.recipeapp.Repository;

import com.gurnish.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
