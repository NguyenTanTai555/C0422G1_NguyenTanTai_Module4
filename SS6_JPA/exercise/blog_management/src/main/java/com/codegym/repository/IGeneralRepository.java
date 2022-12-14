package com.codegym.repository;

import com.codegym.model.Blog;

import java.util.List;

public interface IGeneralRepository {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
