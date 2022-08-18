package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer,Product> productMap = new HashMap<>();

    static {
        productMap.put(1,new Product(1,"Chocolate",50000,"Hộp 12 gói","Orion"));
        productMap.put(2,new Product(2,"Custard",45000,"Hộp 8 gói","Orion"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getProductId(),product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>(productMap.values());
        List<Product> products = new ArrayList<>();
        for (Product product:productList){
            if (product.getName().contains(name)){
                products.add(product);
            }
        }
        return products;
    }
}
