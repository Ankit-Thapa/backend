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
import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.service.CartService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CartController {

	@Autowired
	private CartService CartService;
	
	@GetMapping("/cart")
	private List<Cart> getAllCart(){
		return CartService.getAllCart();
	}
	
	@PostMapping("/cart")  
	private ResponseEntity<String> saveCart(@RequestBody Cart cart)   
	{  
		String msg="Successfully Uploaded " +cart;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post");
		CartService.saveCart(cart);   
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	} 
	
	@GetMapping("/cart/{id}")  
	private List<Cart> getCart(@PathVariable("id") Long id)   
	{  
		return CartService.getUserById(id);  
	
	}
	
	@DeleteMapping("/cart/{id}")  
	private String deleteCart(@PathVariable("id") Long id)   
	{  
		CartService.deleteCartById(id);  
		return "record deleted with id " +id;
	}
}
