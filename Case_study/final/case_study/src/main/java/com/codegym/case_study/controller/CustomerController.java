package com.codegym.case_study.controller;

import com.codegym.case_study.model.person.Customer;
import com.codegym.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        return modelAndView;
    }

    @GetMapping("/list")
    public ModelAndView customerList(@PageableDefault(size = 5)Pageable pageable,
                                     @RequestParam Optional<String> name ,
                                     Optional<String> customerType){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        String keyNameVal = name.orElse("");
        String keyCustomerTypeVal= customerType.orElse("");
        modelAndView.addObject("customers",customerService.findAllCustomer(keyNameVal,keyCustomerTypeVal,pageable));
        modelAndView.addObject("keyNameVal",keyNameVal);
        modelAndView.addObject("keyCustomerTypeVal",keyCustomerTypeVal);
    return modelAndView;
    }
//
    @GetMapping("/create")
    public String formCreateCus(Model model){
        model.addAttribute("customer",new Customer());
        return "/customer/create";
    }

    @PostMapping("/createCus")
    public String createCus(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
    this.customerService.saveCustomer(customer);
    redirectAttributes.addFlashAttribute("msg","create successfully !!");
    return "redirect:/customer";
    }
}
