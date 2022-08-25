package com.codegym.music_validate.controller;

import com.codegym.music_validate.dto.MusicDto;
import com.codegym.music_validate.model.Music;
import com.codegym.music_validate.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/home")
    public String showList(Model model,
                           @PageableDefault(value = 3)Pageable pageable) {
        model.addAttribute("musics", this.musicService.findAll(pageable));
        return "/music/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("musicDto", new MusicDto());
        return "/music/create";
    }

    @PostMapping("/createMusic")
    public String createMusic(@ModelAttribute @Valid MusicDto musicDto,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes,
                              Model model) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("musicDto", musicDto);
            return "/music/create";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDto, music);
        this.musicService.save(music);
        redirectAttributes.addFlashAttribute("msg", "Register successfully");
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String formEdit(@PathVariable int id,
                           Model model){
        model.addAttribute("musicDto",this.musicService.findById(id));
        return "/music/edit";
    }

    @PostMapping("/edit")
    public String editMusic(@ModelAttribute @Valid MusicDto musicDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "redirect:/home";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDto,music);
        this.musicService.save(music);
        redirectAttributes.addFlashAttribute("edit","Edit Successfully!!");
        return "redirect:/home";
    }

}
