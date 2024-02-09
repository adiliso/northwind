package org.adil.northwind.dataAccess;

import org.adil.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
