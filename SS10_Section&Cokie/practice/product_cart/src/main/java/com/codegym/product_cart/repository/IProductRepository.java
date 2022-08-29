package com.codegym.product_cart.repository;

import com.codegym.product_cart.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Integer> {
}
