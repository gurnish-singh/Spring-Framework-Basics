package com.gurnish.recipeapp.Repository;

import com.gurnish.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepositories extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String string);
}
