package org.adil.northwind.business.abstracts;

import org.adil.northwind.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}
