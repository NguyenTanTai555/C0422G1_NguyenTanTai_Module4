package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> findAll(String name, String cName, Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

}
