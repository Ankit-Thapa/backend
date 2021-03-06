package com.demoproject.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.CartProductsMapping;

public interface CartProductMappingRepository extends JpaRepository<CartProductsMapping,Long>{

	@Query(value="SELECT * FROM Cart_Products_Mapping where cart_id =?1",nativeQuery=true)
	List<CartProductsMapping> findByCartId(Long id);

//	 @Query(value="SELECT * FROM Cart_Products_Mapping where cart_id =?1",nativeQuery=true)
//	 List<CartProductsMapping> findByCartId(Long id);

}
