package com.gurnish.recipeapp.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    @Lob////Large object field
    private Byte[] image;
    //    private Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredients> ingredients= new HashSet<>();

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @ManyToMany()
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories =new HashSet<>();
    public void setNotes(Notes notes) {
        this.notes = notes;
        notes.setRecipe(this);
    }
    public Recipe addIngredient(Ingredients ingredients){
        ingredients.setRecipe(this);
        this.ingredients.add(ingredients);
        return this;
    }


}
