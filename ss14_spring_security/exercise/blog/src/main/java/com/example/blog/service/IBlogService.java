package com.example.blog.service;

import com.example.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
//    Page<Blog> findAll(String name, String cName, Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

}
