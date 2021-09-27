package com.gurnish.Controllers;

import com.gurnish.services.OwnerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    private final OwnerServices ownerServices;

    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @RequestMapping("/owners")

    public String listOwners(Model model) {
        model.addAttribute("owners",ownerServices.findAll());
        return "owners/index";
    }
}