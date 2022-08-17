package com.codegym.controller;

import com.codegym.model.Medical;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MedicalController {

    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/medical")
    public String goMedical(Model model) {
        model.addAttribute("medical", new Medical());
        model.addAttribute("dayList", this.iMedicalService.showDayList());
        model.addAttribute("monthList", this.iMedicalService.showMonthList());
        model.addAttribute("yearList", this.iMedicalService.showYearList());
        model.addAttribute("yearOfBirth", this.iMedicalService.yearOfBirthList());
        model.addAttribute("genderList", this.iMedicalService.genderList());
        model.addAttribute("informationList", this.iMedicalService.informationList());
        model.addAttribute("nationalityList", this.iMedicalService.nationalityList());
        return "medical";
    }

    @PostMapping("/sen")
    public String update(@ModelAttribute Medical medical,
                         RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("medical", medical);
        return "view";
    }
}
