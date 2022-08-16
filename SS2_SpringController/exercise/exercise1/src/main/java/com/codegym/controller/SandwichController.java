package com.codegym.controller;

import com.codegym.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SandwichController {

    @Autowired
    private ISandwichService iSandwichService;

    @GetMapping("/")
    public String goHome(Model model) {
        List<String> condiments = this.iSandwichService.findAll();
        model.addAttribute("list", condiments);
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam(required = false) String[] spice, Model model) {
        if (spice == null) {
            model.addAttribute("message", "Please choose condiment you want !!");
            model.addAttribute("list", this.iSandwichService.findAll());
            return "index";
        }
        model.addAttribute("list", this.iSandwichService.findAll());
        model.addAttribute("spice", this.iSandwichService.findSpice(spice));
        return "index";
    }
}
