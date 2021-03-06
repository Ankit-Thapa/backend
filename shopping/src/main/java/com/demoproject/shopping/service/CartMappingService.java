package com.demoproject.shopping.service;

import java.util.List;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.CartProductsMapping;
public interface CartMappingService {

	public List<CartProductsMapping> getAllCartMapping();

	public CartProductsMapping saveCart(CartProductsMapping cartProductsMapping);

	public void deleteCartById(Long id);

	public List<CartProductsMapping> getCartDetailById(Long id);


}
