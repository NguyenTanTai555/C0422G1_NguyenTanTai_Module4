package com.codegym.registrationform.controller;

import com.codegym.registrationform.dto.UserDto;
import com.codegym.registrationform.model.User;
import com.codegym.registrationform.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String home() {
        return "list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/create-user")
    public String createUser(@ModelAttribute("userDto") @Valid UserDto userDto,
                             BindingResult bindingResult,
                             Model model) {
//        model.addAttribute("user", new User());
        new UserDto().validate(userDto, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("userDto",userDto);
            return "create";
        }

        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        this.userService.save(user);
        model.addAttribute("msg", "Register successfully");
        return "list";
    }
}
