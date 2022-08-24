package com.codegym.products.repository;

import com.codegym.products.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameContaining(String name, Pageable pageable);
}
