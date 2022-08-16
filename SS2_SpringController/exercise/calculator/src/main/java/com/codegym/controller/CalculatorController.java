package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String goHome() {
        return "index";
    }

    @PostMapping("/operator")
    public String operator(@RequestParam String num1,
                           @RequestParam String num2,
                           @RequestParam String operator,
                           Model model) {
        try {
            model.addAttribute("result", this.iCalculatorService.operator(Double.parseDouble(num1),
                    Double.parseDouble(num2), operator));
        } catch (NumberFormatException e) {
            model.addAttribute("error",
                    "please enter num other than 0");
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "index";
    }
}
