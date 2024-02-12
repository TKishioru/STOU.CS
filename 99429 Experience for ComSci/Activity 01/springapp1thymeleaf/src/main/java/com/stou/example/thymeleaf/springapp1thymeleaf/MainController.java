package com.stou.example.thymeleaf.springapp1thymeleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("")
    public String getIndex() {
        return "index";
    }
    
    @GetMapping("/product")
    public String getProduct(Model model) {
        Product p = new Product(1, "TV");
        model.addAttribute("product", p);
        return "showproduct";
    }
    
    @GetMapping("/products")
    public String getProductBs(Model model) {
        List<Product> products = List.of(
            new Product(1, "TV"),
            new Product(2, "Phone"),
            new Product(3, "Robot")
        );
        model.addAttribute("products", products);
        return "showproduct_bs";
    }
}
