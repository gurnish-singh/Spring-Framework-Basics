package com.gurnish.recipeapp.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Desciption;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)////its always eager though for one to one
    ///dont want any cascade reference
    private UnitOfMeasure unitOfMeasure;

    public Ingredients() {
    }

    public Ingredients( String desciption, BigDecimal amount,  UnitOfMeasure unitOfMeasure) {
        Desciption = desciption;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
