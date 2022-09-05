package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    Page<Blog> findAllByCategory_CategoryId(Integer id,Pageable pageable);

    Page<Blog> findAllByBlogNameContaining(String blogName, Pageable pageable);
}
