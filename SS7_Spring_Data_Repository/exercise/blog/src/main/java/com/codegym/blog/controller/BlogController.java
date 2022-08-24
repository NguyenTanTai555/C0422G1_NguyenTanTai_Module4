package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.IBlogService;
import com.codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String listBlog(Model model,
                           @PageableDefault(size = 5) Pageable pageable,
                           @RequestParam Optional<String> name,
                           @RequestParam Optional<String> categoryName) {
        String keyName = name.orElse("");
        String categoryNames = categoryName.orElse("");
        Page<Blog> blogPage = blogService.findAll(keyName, categoryNames, pageable);
        model.addAttribute("blogList", blogPage);
        model.addAttribute("category", categoryService.findAllCategory());
        model.addAttribute("keyVal", keyName);
        return "/blogs/list";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView viewBlog(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/blogs/view");
        modelAndView.addObject("blog", blogService.findById(id));
        return modelAndView;
    }

    @GetMapping("/showFormCreate")
    public ModelAndView formCreateBlog() {
        ModelAndView modelAndView = new ModelAndView("/blogs/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("category", categoryService.findAllCategory());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView createBlog(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/blogs/create");
        blogService.save(blog);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView formEditBlog(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("/blogs/edit");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("category", categoryService.findAllCategory());
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("redirect:/blog/list");
        blogService.save(blog);
        return modelAndView;
    }

    @PostMapping("/delete")
    public String deleteBlog(@RequestParam Integer id, Model model) {
        blogService.remove(id);
        return "redirect:/blog/list";
    }

    @GetMapping("/showFormCreateCategory")
    public ModelAndView ShowFormCategory() {
        ModelAndView modelAndView = new ModelAndView("/categories/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView createCategory(@ModelAttribute Category category) {
        ModelAndView modelAndView = new ModelAndView("/categories/create");
        categoryService.save(category);
        return modelAndView;
    }

}