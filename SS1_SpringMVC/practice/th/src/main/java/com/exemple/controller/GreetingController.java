package com.exemple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting(){
        return "hello";
    }
    @GetMapping("/hello")
    public String result(@RequestParam double  usd, Model model){
        double vnd = usd*23000;
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",vnd);
        return "hello";
    }
}
