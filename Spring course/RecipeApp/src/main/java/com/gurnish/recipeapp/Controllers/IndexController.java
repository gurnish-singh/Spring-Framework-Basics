package com.gurnish.recipeapp.Controllers;

import com.gurnish.recipeapp.Repository.CategoryRepositories;
import com.gurnish.recipeapp.Repository.UnitOfMeasureRepository;
import com.gurnish.recipeapp.model.Category;
import com.gurnish.recipeapp.model.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepositories categoryRepositories;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepositories categoryRepositories, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepositories = categoryRepositories;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"/","index"})
    public  String getIndexPage(Model model){
        model.addAttribute("something");
        Optional<Category>foundCategory=categoryRepositories.findByDescription("Australian");
        Optional<UnitOfMeasure> foundUOM= unitOfMeasureRepository.findByUom("Cup");
        System.out.println(foundCategory.get().getId());
        System.out.println(foundUOM.get().getId());
        return "index";
    }
}
