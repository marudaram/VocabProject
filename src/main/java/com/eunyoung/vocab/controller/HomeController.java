package com.eunyoung.vocab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/main")
    public String home() {
        return "main";
    }
}
