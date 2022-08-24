package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findByBlogNameContainingAndCategory_CategoryNameContaining
            (String name, String cName, Pageable pageable);
}
