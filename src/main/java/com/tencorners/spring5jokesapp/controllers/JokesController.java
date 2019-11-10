package com.tencorners.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {

        model.addAttribute("joke", "joke");

        return "chucknorris";
    }
}
