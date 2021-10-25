package com.demoproject.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.shopping.entity.ShoppingProducts;

public interface ShoppingProductRepository extends JpaRepository<ShoppingProducts,Long> {

}
