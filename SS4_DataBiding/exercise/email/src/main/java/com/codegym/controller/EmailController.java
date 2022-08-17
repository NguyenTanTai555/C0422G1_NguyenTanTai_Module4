package com.codegym.controller;

import com.codegym.model.EmailBox;
import com.codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailController {
    @Autowired
    private IEmailService iEmailService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("languages", this.iEmailService.languages());
        model.addAttribute("pageSize", this.iEmailService.pageSize());
        model.addAttribute("emailBox", new EmailBox("English","25",true,"hello"));
        return "home";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute EmailBox emailBox ,
                         RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("emailBox",emailBox);
        return "view";
    }


}
