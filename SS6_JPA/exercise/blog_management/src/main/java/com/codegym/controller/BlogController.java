package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/blog")
    public ModelAndView showListBlog() {
        List<Blog> blogList = iBlogService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogList", blogList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blogList", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveCustomer(@ModelAttribute("blog") Blog blog) {
        iBlogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        List<Blog> blogList = iBlogService.findAll();
        modelAndView.addObject("blogList",blogList);
        modelAndView.addObject("message", "New Blog created successfully");
        return modelAndView;
    }

}
