package com.codegym.product_cart.service;

import com.codegym.product_cart.model.Product;

import java.util.Map;

public interface ICartService {
    void changeCart(Map<Product,Integer> cart, Integer id, String expression);

    double total(Map<Product,Integer> cart);
}

