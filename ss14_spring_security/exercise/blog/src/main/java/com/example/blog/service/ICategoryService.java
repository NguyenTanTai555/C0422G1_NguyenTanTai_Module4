package com.example.blog.service;

import com.example.blog.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAllCategory();

    Category findById(Integer id);

    void save(Category category);

    void remove(Integer id);

}
