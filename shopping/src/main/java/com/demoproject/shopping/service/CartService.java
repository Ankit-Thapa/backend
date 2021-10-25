package com.demoproject.shopping.service;

import java.util.List;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.User;

public interface CartService {

	public List<Cart> getAllCart();

	public void saveCart(Cart cart);

	public List<Cart> getUserById(Long id);

	public void deleteCartById(Long id);

}
