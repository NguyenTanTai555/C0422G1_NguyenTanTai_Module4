package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayAll();

    void createNewProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(int id);

    Product findProduct(int id);

    List<Product> findProductByName(String name);
}
