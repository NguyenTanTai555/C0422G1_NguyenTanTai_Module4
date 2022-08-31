package com.codegym.blog.service.impl;

import com.codegym.blog.model.Blog;
import com.codegym.blog.repository.IBlogRepository;
import com.codegym.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAllBlogByCategoryId(Integer id, Pageable pageable) {
        return this.blogRepository.findAllByCategory_CategoryId(id,pageable);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.blogRepository.findAll(pageable);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return this.blogRepository.findById(id);
    }

    @Override
    public Blog save(Blog blog) {
        return this.blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        this.blogRepository.deleteById(id);
    }
}
