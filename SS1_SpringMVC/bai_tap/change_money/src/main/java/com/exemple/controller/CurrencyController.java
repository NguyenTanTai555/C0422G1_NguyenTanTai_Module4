package com.exemple.controller;

import com.exemple.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @Autowired
    private ICurrencyService iCurrencyService;

    @GetMapping("/")
    public String home(){
        return "currency";
    }
    @GetMapping("/convert")
    public String result(@RequestParam double  usd, Model model){
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",this.iCurrencyService.convert(usd));
        return "currency";
    }
}
