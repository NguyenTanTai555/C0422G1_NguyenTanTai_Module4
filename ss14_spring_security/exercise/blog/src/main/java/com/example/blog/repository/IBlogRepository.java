package com.example.blog.repository;

import com.example.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
//    Page<Blog> findByNameBlogContainingAndCategory_CategoryNameContaining
//            (String name, String cName, Pageable pageable);
}
