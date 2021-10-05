package com.gurnish.Controllers;

import com.gurnish.services.VetServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    VetServices vetService;

    public VetController(VetServices vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","vets.html"})

    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll()) ;
        return "vets/index";
    }
}
