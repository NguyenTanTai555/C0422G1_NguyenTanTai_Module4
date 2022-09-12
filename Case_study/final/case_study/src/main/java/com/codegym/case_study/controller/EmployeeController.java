package com.codegym.case_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView listEmployee(@PageableDefault(size = 3)Pageable pageable,
                                     @RequestParam Optional<String> name,
                                     @RequestParam Optional<String> typeEmployee){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        return modelAndView;
    }
}
