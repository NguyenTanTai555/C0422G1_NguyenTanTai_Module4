package com.codegym.blog.service;

import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICategoryService extends IGeneralService<Category>{
    Page<Category> findAll(Pageable pageable);

    Optional<Category> findById(Integer id);

    Category save(Category category);

    void remove(Integer id);
}
