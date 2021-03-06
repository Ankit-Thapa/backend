package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.ShoppingProducts;
import com.demoproject.shopping.repository.ShoppingProductRepository;
import com.demoproject.shopping.repository.ShoppingRepository;
import com.demoproject.shopping.service.ShoppingProductService;

@Service
public class ShoppingProductServiceImpl implements ShoppingProductService {

	@Autowired
	private ShoppingProductRepository shoppingProductRepository;
	
	@Override
	public void saveShoppingProduct(ShoppingProducts shoppingproduct) {
		shoppingProductRepository.save(shoppingproduct);
	}
	
	@Override
	public List<ShoppingProducts> getAllShoppingProducts(){
		List<ShoppingProducts> shoppingProduct = new ArrayList<ShoppingProducts>();  
		shoppingProductRepository.findAll().forEach(productData -> shoppingProduct.add(productData));  
		return shoppingProduct;
	}
}
