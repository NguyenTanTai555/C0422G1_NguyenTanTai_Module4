package com.codegym.blog.controller;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.service.IBlogService;
import com.codegym.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryRestController {


    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/category")
    public ResponseEntity<Page<Category>> findAllCategory(@PageableDefault(size = 3) Pageable pageable) {
        Page<Category> categories = this.categoryService.findAll(pageable);
        if (!categories.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Page<Blog>> findBlogOfCategoryId(@PageableDefault(size = 3) Pageable pageable,
                                                           @PathVariable Integer id) {
        Page<Blog> blogPage = this.blogService.findAllBlogByCategoryId(id, pageable);
        if (!blogPage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogPage, HttpStatus.OK);
    }
}
