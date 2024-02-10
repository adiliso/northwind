package org.adil.northwind.API.controller;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.ProductService;
import org.adil.northwind.core.utilities.result.DataResult;
import org.adil.northwind.core.utilities.result.Result;
import org.adil.northwind.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){

        return this.productService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){

        return this.productService.add(product);
    }
}
