package com.codegym.products.service.impl;

import com.codegym.products.model.Product;
import com.codegym.products.repository.IProductRepository;
import com.codegym.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> displayAll(String name, Pageable pageable) {
        return iProductRepository.findByNameContaining(name, pageable);
    }

    @Override
    public void createNewProduct(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void editProduct(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        iProductRepository.delete(findProduct(id));
    }

    @Override
    public Product findProduct(Long id) {
        return iProductRepository.findById(id).orElse(null);
    }
}
