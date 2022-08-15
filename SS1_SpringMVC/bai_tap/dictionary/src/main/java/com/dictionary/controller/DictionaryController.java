package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String getDictionary(){
        return "dictionary";
    }

    @PostMapping("/search")
    public String search(@RequestParam String eng, Model model){

        model.addAttribute("eng",eng);
        model.addAttribute("vie",this.iDictionaryService.change(eng));

        return "dictionary";
    }
}
