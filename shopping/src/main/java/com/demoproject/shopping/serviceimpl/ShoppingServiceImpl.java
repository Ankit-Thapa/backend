package com.demoproject.shopping.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.Shopping;
import com.demoproject.shopping.repository.ShoppingRepository;
import com.demoproject.shopping.service.ShoppingService;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	private ShoppingRepository shoppingRepository;
	
	@Override
	public void saveShopping(Shopping shopping) {
//		ShoppingRepository.save(shopping);
	}
}
