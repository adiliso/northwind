package org.adil.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.adil.northwind.business.abstracts.ProductService;
import org.adil.northwind.core.utilities.result.*;
import org.adil.northwind.dataAccess.ProductDao;
import org.adil.northwind.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Override
    public DataResult<List<Product>> getAll(){
//        return new ErrorDataResult<>("DSAD", new ArrayList<>());
        return new SuccessDataResult<>("Ugrulu",this.productDao.findAll());
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccessResult(product.getProductName()+" ugurla save olundu");
    }
}
