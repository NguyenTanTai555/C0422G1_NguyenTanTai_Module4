package com.codegym.product_cart.controller;

import com.codegym.product_cart.model.Product;
import com.codegym.product_cart.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Map;

public class ShoppingCartController {

    @Autowired
    private ICartService cartService;

    @GetMapping("/shopping-cart")
    public String goCart(Model model, @SessionAttribute Map<Product, Integer> cart) {
        model.addAttribute("cart", cart);
        model.addAttribute("total", cartService.total(cart));
        return "cart";
    }
}
