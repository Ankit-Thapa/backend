package com.demoproject.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demoproject.shopping.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

	ProductCategory findById(Long id);


}
