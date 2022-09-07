package com.example.blog.service.impl;

import com.example.blog.entity.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.blogRepository.findAll(pageable);
    }

//    @Override
//    public Page<Blog> findAll(String name, String cName, Pageable pageable) {
//        return blogRepository.findByNameBlogContainingAndCategory_CategoryNameContaining(name, cName, pageable);
//    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepository.delete(findById(id));
    }
}
