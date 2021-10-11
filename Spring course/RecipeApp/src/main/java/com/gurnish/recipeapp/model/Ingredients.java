package com.gurnish.recipeapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"recipe"})
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

}
