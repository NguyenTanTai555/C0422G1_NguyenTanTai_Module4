package com.codegym.product_cart.controller;

import com.codegym.product_cart.model.Product;
import com.codegym.product_cart.service.ICartService;
import com.codegym.product_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    private IProductService productService ;

    @Autowired
    private ICartService cartService;

    @ModelAttribute("cart")
    public Map<Product,Integer> cart(){
        return new HashMap<>();
    }

    @GetMapping("/shop")
    public ModelAndView goListShop(){
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products",productService.findAll());
        return modelAndView;
    }

    @GetMapping("/view")
    public String goView(@RequestParam Integer id ,
                         Model model){
        Product product = productService.findById(id).orElse(null);
        if (product==null){
            return "/error";
        }
        model.addAttribute("product",product);
        return "/view";
    }

    @GetMapping("/create")
    public String createCart(@RequestParam (defaultValue = "0")Integer id ,
                             String expression,
                             @SessionAttribute Map<Product,Integer> cart,
                             Model model){
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()){
            return "/error";
        }
        cartService.changeCart(cart,id,expression);
        model.addAttribute("total", cartService.total(cart));
        model.addAttribute("cart", cart);
        return "/cart";
    }
    @GetMapping("/remove")
    public String removeToCart(@SessionAttribute Map<Product, Integer> cart,
                               @RequestParam Integer id,
                               Model model ){
        Product product = productService.findById(id).orElse(null);
        cart.remove(product);
        model.addAttribute("total", cartService.total(cart));
        model.addAttribute("cart", cart);
        return "/cart";
    }
}
