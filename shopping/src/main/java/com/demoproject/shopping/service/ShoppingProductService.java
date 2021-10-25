package com.demoproject.shopping.service;

import java.util.List;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.ShoppingProducts;

public interface ShoppingProductService {

	public void saveShoppingProduct(ShoppingProducts shoppingproduct);

	public List<ShoppingProducts> getAllShoppingProducts();

}
