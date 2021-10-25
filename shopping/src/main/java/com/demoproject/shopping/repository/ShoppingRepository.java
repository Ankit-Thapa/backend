package com.demoproject.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoproject.shopping.entity.Shopping;

public interface ShoppingRepository extends JpaRepository<Shopping,Long>{

}
