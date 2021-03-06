package com.demoproject.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.shopping.entity.Cart;
import com.demoproject.shopping.entity.CartProductsMapping;
import com.demoproject.shopping.service.CartMappingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CartProductMappingController {

	
	@Autowired
	private CartMappingService CartMappingService;
	
	@GetMapping("/cart-product")
	private List<CartProductsMapping> getAllCart(){
		return CartMappingService.getAllCartMapping();
	}
	
	@PostMapping("/cart-product")  
	private CartProductsMapping saveCart(@RequestBody CartProductsMapping cartProductsMapping)   
	{  
		System.out.println(cartProductsMapping);
		String msg="Successfully Uploaded " +cartProductsMapping;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post"); 
		return CartMappingService.saveCart(cartProductsMapping); 
	} 
	
	@GetMapping("/cart-product/{id}")  
	private List<CartProductsMapping> getCartDetailById(@PathVariable("id") Long id)   
	{  
		return CartMappingService.getCartDetailById(id);  
	}
	
	@DeleteMapping("/cart-product/{id}")  
	private String deleteCart(@PathVariable("id") Long id)   
	{  
		CartMappingService.deleteCartById(id);  
		return "record deleted with id " +id;
	}
}
