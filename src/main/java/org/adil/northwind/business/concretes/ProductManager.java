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
        return new SuccessDataResult<>("Ugrulu",this.productDao.findAll());
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccessResult(product.getProductName()+" ugurla save olundu");
    }

    @Override
    public DataResult<Product> findByProductName(String productName) {
        Product product = this.productDao.findByProductName(productName);
        if (product == null) {
            return new ErrorDataResult<>(productName+" kimdi ə",product);
        } else {
            return new SuccessDataResult<>("tafdin qaqa",product);
        }
    }

    @Override
    public DataResult<Product> findProductByProductNameAndUnitPrice(String productName, int unitPrice) {
        Product product = this.productDao.findProductByProductNameAndUnitPrice(productName, unitPrice);
        if (product == null) {
            return new ErrorDataResult<>(productName+" kimdi ə",product);
        } else {
            return new SuccessDataResult<>("tafdin qaqa",product);
        }
    }

    @Override
    public DataResult<List<Product>> findProductByCategoryId(int categoryId) {
        List<Product> products = this.productDao.findProductByCategoryId(categoryId);
        if (products ==null) {
            return new ErrorDataResult<>("Bu categoryId sistemde movcud deyil.",products);
        } else {
            return new SuccessDataResult<>("Products ugurla tapildi.",products);
        }
    }

    @Override
    public DataResult<List<Product>> findProductsByUnitPriceBefore(int unitPrice) {
        List<Product> products = this.productDao.findProductsByUnitPriceBefore(unitPrice);
        if (products ==null) {
            return new ErrorDataResult<>("Bu unit-price sistemde movcud deyil.",products);
        } else {
            return new SuccessDataResult<>("Products ugurla tapildi.",products);
        }
    }
}
