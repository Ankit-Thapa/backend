package com.demoproject.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;

public interface ProductRepository  extends JpaRepository<Product,Long> {

}
