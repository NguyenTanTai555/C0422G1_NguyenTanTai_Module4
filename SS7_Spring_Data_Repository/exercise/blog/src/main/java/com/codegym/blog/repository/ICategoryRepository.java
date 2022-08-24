package com.codegym.blog.repository;

import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    Page<Category> findAllByCategoryNameContaining(String categoryName, Pageable pageable);
}
