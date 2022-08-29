package com.codegym.product_cart.service;

import com.codegym.product_cart.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Integer id);
}
