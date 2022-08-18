package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);

    void remove(int id);

    void updateProduct(int id ,Product product);

    List<Product> findByName(String name);
}
