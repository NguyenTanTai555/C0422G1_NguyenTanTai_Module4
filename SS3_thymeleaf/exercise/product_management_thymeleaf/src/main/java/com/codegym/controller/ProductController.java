package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String showProductList(Model model) {
        List<Product> products = this.iProductService.findAll();
        model.addAttribute("products", products);
        return "view";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setProductId((int) (Math.random() * 1000));
        this.iProductService.save(product);
        redirectAttributes.addFlashAttribute("msg", "Add success ??");
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable int id, Model model) {
        model.addAttribute("products", this.iProductService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateProduct(Product product, RedirectAttributes redirectAttributes) {
        iProductService.updateProduct(product.getProductId(), product);
        redirectAttributes.addFlashAttribute("update", "Update successfully !!");
        return "redirect:/";
    }

    @GetMapping("/remove/{id}")
    public String delete(@PathVariable int id ,Model model ){
        model.addAttribute("products",iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/remove")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        iProductService.remove(product.getProductId());
        redirectAttributes.addFlashAttribute("delete","Delete successfully");
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String detail(@PathVariable int id ,Model model){
        model.addAttribute("products",iProductService.findById(id));
        return "detail";
    }

    @GetMapping("/find")
    public String findProductByName(@RequestParam String nameFind , Model model){
        model.addAttribute("products",this.iProductService.findByName(nameFind));
        return "view";
    }
}
