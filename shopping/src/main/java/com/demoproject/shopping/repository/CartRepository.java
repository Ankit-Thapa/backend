package com.demoproject.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;

public interface CartRepository extends JpaRepository<Cart,Long>{

	 @Query(value="SELECT * FROM Cart where user_id =?1",nativeQuery=true)
	List<Cart> findByUserId(Long id);
}
