package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.CartProductsMapping;
import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.repository.CartProductMappingRepository;
import com.demoproject.shopping.service.CartMappingService;

@Service
public class CartMappingServiceImpl implements CartMappingService{

	
	@Autowired 
	private CartProductMappingRepository CartProductMappingRepository;
	
	@Override
	public List<CartProductsMapping> getAllCartMapping(){
		List<CartProductsMapping> cart = new ArrayList<CartProductsMapping>();  
		CartProductMappingRepository.findAll().forEach(cartData -> cart.add(cartData));  
		System.out.println(cart);
		return cart;
	}
	
	@Override
	public CartProductsMapping saveCart(CartProductsMapping cartProductsMapping) {
		return CartProductMappingRepository.save(cartProductsMapping); 
	}
	
	@Override
	public List<CartProductsMapping> getCartDetailById(Long id){
		return CartProductMappingRepository.findByCartId(id);
	}

	@Override
	public void deleteCartById(Long id) {
		CartProductMappingRepository.deleteById(id); 
	}

	
	
}
