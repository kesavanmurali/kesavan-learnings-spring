package com.kesavan.petclinic.web.controllers;

import com.kesavan.petclinic.data.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String index(Model model){
        model.addAttribute("vets", this.vetService.findAll());
        return "vets/index";
    }

}
