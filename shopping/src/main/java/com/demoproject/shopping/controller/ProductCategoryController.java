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
import com.demoproject.shopping.entity.ProductCategory;
import com.demoproject.shopping.service.ProductCategoryService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductCategoryController {
	@Autowired
	private ProductCategoryService ProductCategoryService;

	@GetMapping("/product-category")
	private List<ProductCategory> getAllProductCategory(){
		return ProductCategoryService.getAllProductCategory();
	}
	
	@GetMapping("/product-category/{id}")  
	private ResponseEntity<ProductCategory> getProductCategory(@PathVariable("id") int id)   
	{  
		ProductCategory body=ProductCategoryService.getProductCategory(id);  
		HttpHeaders header = new HttpHeaders();
		header.add("key", "this is header");
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(body);
	}
	
	@PostMapping("/product-category/save")  
	private ResponseEntity<String> saveUser(@RequestBody ProductCategory productCategory)   
	{  
		String msg="Successfully Uploaded " +productCategory;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post");
		ProductCategoryService.saveProductCategory(productCategory);   
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	} 
	
	@PatchMapping("/product-category")  
	private String update(@RequestBody ProductCategory productCategory)   
	{  
		ProductCategoryService.update(productCategory);  
		return "successfully updated"+productCategory;  
	} 
	@DeleteMapping("/product-category/{id}")  
	private String deleteProduct(@PathVariable("id") int id)   
	{  
		ProductCategoryService.deleteProductCategoryById(id);  
		return "record deleted with id " +id;
	}
}
