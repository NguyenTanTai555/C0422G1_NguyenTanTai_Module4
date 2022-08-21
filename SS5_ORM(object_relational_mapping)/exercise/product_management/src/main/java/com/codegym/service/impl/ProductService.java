package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> displayAll() {
        return this.iProductRepository.displayAll();
    }

    @Override
    public void createNewProduct(Product product) {
        int id = (int) Math.floor(Math.random() * 1000);
        product.setId(id);
        this.iProductRepository.createNewProduct(product);
    }

    @Override
    public void editProduct(Product product) {
        this.iProductRepository.editProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        this.iProductRepository.deleteProduct(id);
    }

    @Override
    public Product findProduct(int id) {
        return this.iProductRepository.findProduct(id);
    }

    @Override
    public List<Product> findProductByName(String name) {
        return this.iProductRepository.findProductByName(name);
    }
}
