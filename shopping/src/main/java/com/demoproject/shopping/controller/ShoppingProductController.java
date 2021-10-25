package com.demoproject.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.Shopping;
import com.demoproject.shopping.entity.ShoppingProducts;
import com.demoproject.shopping.service.ShoppingProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ShoppingProductController {

	@Autowired
	private ShoppingProductService shoppingProductService;
	
	@PostMapping("/shopping-product")  
	private ResponseEntity<String> saveShoppingProduct(@RequestBody ShoppingProducts shoppingproduct)   
	{  
		String msg="Successfully Uploaded " +shoppingproduct;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post");
		shoppingProductService.saveShoppingProduct(shoppingproduct);   
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}  
	
	@GetMapping("/shopping-product")
	private List<ShoppingProducts> getAllShoppingProducts(){
		return shoppingProductService.getAllShoppingProducts();
	}
}
