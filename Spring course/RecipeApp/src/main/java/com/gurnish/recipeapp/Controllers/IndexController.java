package com.gurnish.recipeapp.Controllers;

import com.gurnish.recipeapp.Repository.CategoryRepository;
import com.gurnish.recipeapp.Repository.RecipeRepository;
import com.gurnish.recipeapp.Repository.UnitOfMeasureRepository;
import com.gurnish.recipeapp.Services.RecipeService;
import com.gurnish.recipeapp.model.Category;
import com.gurnish.recipeapp.model.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
