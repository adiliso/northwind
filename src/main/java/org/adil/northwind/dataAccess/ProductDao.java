package org.adil.northwind.dataAccess;

import org.adil.northwind.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
