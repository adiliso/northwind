package org.adil.northwind.business.abstracts;

import org.adil.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
