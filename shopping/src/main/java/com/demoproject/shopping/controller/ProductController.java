package com.demoproject.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product/save")  
	private ResponseEntity<String> saveUser(@RequestBody Product product)   
	{  
		String msg="Successfully Uploaded " +product;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post");
		productService.saveProduct(product);   
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}  
	
	@GetMapping("/product")
	private List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/{pageNo}/{pageSize}")
	private List<Product> getProductBypagination(@PathVariable int pageNo,@PathVariable int pageSize){
		return productService.getProductBypagination(pageNo,pageSize);
	}
	
	
	@PatchMapping("/product")
	private void patch(@RequestBody Product product) {
		productService.patch(product);
	}
	
	@GetMapping("/product/{id}")  
	private ResponseEntity<Product> getProduct(@PathVariable("id") long id)   
	{  
		Product body=productService.getProductById(id);  
		HttpHeaders header = new HttpHeaders();
		header.add("key", "this is header");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(body);
	}
	@DeleteMapping("/product/{id}")  
	private String deleteProduct(@PathVariable("id") Long id)   
	{  
		productService.deleteProductById(id);  
		return "record deleted with id " +id;
	}
}
