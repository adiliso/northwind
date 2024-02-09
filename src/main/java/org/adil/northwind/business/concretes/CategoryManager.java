package org.adil.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.CategoryService;
import org.adil.northwind.dataAccess.CategoryDAO;
import org.adil.northwind.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> getAll() {
        List<Category> categories = categoryDAO.findAll();
        return categories;
    }
}
