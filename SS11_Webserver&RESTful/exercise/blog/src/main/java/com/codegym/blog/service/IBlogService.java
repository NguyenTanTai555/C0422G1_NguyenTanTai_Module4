package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBlogService extends IGeneralService<Blog>{
    Page<Blog> findAllBlogByCategoryId(Integer id , Pageable pageable);

    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> findById(Integer id);

    Blog save(Blog blog);

    void remove(Integer id);
}
