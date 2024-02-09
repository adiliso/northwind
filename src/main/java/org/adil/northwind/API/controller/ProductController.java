package org.adil.northwind.API.controller;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.ProductService;
import org.adil.northwind.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAll")

    public List<Product> getAll(){

        return this.productService.getAll();
    }
}
