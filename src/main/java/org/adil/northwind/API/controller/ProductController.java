package org.adil.northwind.API.controller;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.ProductService;
import org.adil.northwind.core.utilities.result.DataResult;
import org.adil.northwind.core.utilities.result.Result;
import org.adil.northwind.core.utilities.result.SuccessDataResult;
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
    @GetMapping("/find-by-product-name")
    public DataResult<Product> findByProductName(@RequestParam String productName){
        return this.productService.findByProductName(productName);
    }
    @GetMapping("/find-by-product-name-and-unit-price")
    public DataResult<Product> findProductByProductNameAndUnitPrice(@RequestParam String productName,@RequestParam int unitPrice){
        return this.productService.findProductByProductNameAndUnitPrice(productName,unitPrice);
    }
    @GetMapping("/find-product-by-category-id")
    public DataResult<List<Product>> findProductByCategoryId(@RequestParam int categoryId){
        return this.productService.findProductByCategoryId(categoryId);
    }
    @GetMapping("find-products-by-unit-price-is-less-than")
    public DataResult<List<Product>> findProductsByUnitPriceBefore(int unitPrice){
        return this.productService.findProductByUnitPriceIsLessThan(unitPrice);
    }

}
