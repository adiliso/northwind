package org.adil.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.ProductService;
import org.adil.northwind.dataAccess.ProductDao;
import org.adil.northwind.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Override
    public List<Product> getAll(){
        List<Product> products =  this.productDao.findAll();
        return products;
    }
}
