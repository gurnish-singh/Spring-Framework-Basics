package com.gurnish.recipeapp.Repository;

import com.gurnish.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositories extends CrudRepository<Category,Long> {
}
