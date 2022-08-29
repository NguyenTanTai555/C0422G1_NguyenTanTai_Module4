package com.codegym.case_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/facility/list");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView listFacility(){
        ModelAndView modelAndView = new ModelAndView("facility/list");
        return modelAndView;
    }
}
