package com.codegym.controller;

import com.codegym.model.Medical;
import com.codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalController {

    @Autowired
    private IMedicalService iMedicalService;

    @GetMapping("/")
    public String goMedicalList(Model model) {
        model.addAttribute("list", iMedicalService.showMedical());
        return "medical_list";
    }

    @GetMapping("/add")
    public String goMedicalAdd(Model model) {
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

    @PostMapping("/save")
    public String update(@ModelAttribute Medical medical, int id) {
        this.iMedicalService.save(medical);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String goMedicalDeclarationUpdatePage(@PathVariable int id, Model model) {
        model.addAttribute("medical", this.iMedicalService.findById(id));
        model.addAttribute("years", this.iMedicalService.showDayList());
        model.addAttribute("months", this.iMedicalService.showMonthList());
        model.addAttribute("days", this.iMedicalService.yearOfBirthList());
        model.addAttribute("genders", this.iMedicalService.genderList());
        model.addAttribute("nationalities", this.iMedicalService.nationalityList());
        model.addAttribute("transports", this.iMedicalService.informationList());
        return "medical_update";
    }

    @PostMapping("/save_update/{id}")
    public String saveUpdateMedical(@ModelAttribute Medical medical,
                                    @PathVariable int id) {
        this.update(medical, id);
        return "redirect:/";
    }
}
