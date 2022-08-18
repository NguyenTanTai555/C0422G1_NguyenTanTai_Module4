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
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.iProductRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public void remove(int id) {
        this.iProductRepository.remove(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        this.iProductRepository.updateProduct(id,product);
    }

    @Override
    public List<Product> findByName(String name) {
       return this.iProductRepository.findByName(name);
    }
}
