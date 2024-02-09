package org.adil.northwind.API.controller;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.CategoryService;
import org.adil.northwind.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
}
