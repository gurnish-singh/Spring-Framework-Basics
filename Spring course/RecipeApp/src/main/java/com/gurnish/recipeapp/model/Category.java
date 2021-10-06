package com.gurnish.recipeapp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;

    @ManyToMany(mappedBy = "categories") ////it is specified in Recipe as Set<Category>
    private Set<Recipe> recipeSet;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public Set<Recipe> getRecipeSet() {
        return recipeSet;
    }

    public void setRecipeSet(Set<Recipe> recipeSet) {
        this.recipeSet = recipeSet;
    }
}
