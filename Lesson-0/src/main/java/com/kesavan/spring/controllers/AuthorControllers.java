package com.kesavan.spring.controllers;

import com.kesavan.spring.entities.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorControllers {

    private final AuthorRepository authorRepo;

    public AuthorControllers(AuthorRepository authorRepo){
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepo.findAll());

        return "authors/list";
    }
}
