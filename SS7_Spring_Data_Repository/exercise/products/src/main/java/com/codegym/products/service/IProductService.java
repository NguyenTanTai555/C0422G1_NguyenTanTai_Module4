package com.codegym.products.service;

import com.codegym.products.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> displayAll(String name, Pageable pageable);

    void createNewProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Long id);

    Product findProduct(Long id);
}
