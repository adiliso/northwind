package org.adil.northwind.business.abstracts;

import org.adil.northwind.core.utilities.result.DataResult;
import org.adil.northwind.core.utilities.result.Result;
import org.adil.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}

