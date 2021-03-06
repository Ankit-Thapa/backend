package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.CartProductsMapping;
import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.repository.CartRepository;
import com.demoproject.shopping.service.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository CartRepository;

	@Override
	public List<Cart> getAllCart(){
		List<Cart> cart = new ArrayList<Cart>();  
		CartRepository.findAll().forEach(cartData -> cart.add(cartData));  
		System.out.println(cart);
		return cart;
	}
	
	@Override
	public void saveCart(Cart cart) {
		CartRepository.save(cart); 
	}
	
	@Override
	public List<Cart> getUserById(Long id) {
		
//		Cart optionalData=CartRepository.findByUserId(id); 
//		if(!optionalData.isEmpty()) {
//			return optionalData.get();
//		}
		return CartRepository.findByUserId(id);
	}
	
	@Override
	public void deleteCartById(Long id) {
		CartRepository.deleteById(id); 
	}
	
}
