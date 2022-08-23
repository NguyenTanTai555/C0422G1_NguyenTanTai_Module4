package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/")
    public ModelAndView showListBlog() {
        ModelAndView modelAndView = new ModelAndView("/list");
        List<Blog> blogList = this.iBlogService.findAll();
        modelAndView.addObject("blogs", blogList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        this.iBlogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blogs", iBlogService.findAll());
        modelAndView.addObject("msg", "New blog create successfully");
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView editForm(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/edit");
        Blog blog = iBlogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/edit-blog")
    public ModelAndView editBlog(@ModelAttribute("blog") Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/list");
        iBlogService.save(blog);
        modelAndView.addObject("msg", "Edit Blog successfully");
        modelAndView.addObject("blogs", iBlogService.findAll());
        return modelAndView;
    }

    @GetMapping("/remove/{id}")
    public ModelAndView removeForm(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/remove");
        Blog blog = iBlogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/remove")
    public ModelAndView removeBlog(@ModelAttribute("blog") Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/list");
        iBlogService.remove(blog.getIdBlog());
        modelAndView.addObject("blogs", iBlogService.findAll());
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewBlog(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("blog", iBlogService.findById(id));
        return modelAndView;
    }
}
