package com.example.blog.controller;

import com.example.blog.entity.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public ModelAndView goListCategory(){
        ModelAndView modelAndView = new ModelAndView("category_list");
        List<Category> categoryList = categoryService.findAllCategory();
        modelAndView.addObject("category",categoryList);
        return modelAndView;
    }
    @GetMapping("/showFormCreateCategory")
    public ModelAndView ShowFormCategory() {
        ModelAndView modelAndView = new ModelAndView("/category_create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView createCategory(@ModelAttribute Category category) {
        ModelAndView modelAndView = new ModelAndView("/category_create");
        categoryService.save(category);
        return modelAndView;
    }
}
