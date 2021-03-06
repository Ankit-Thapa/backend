package com.demoproject.shopping.service;

import java.util.List;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;

public interface ProductService {
	public void saveProduct(Product product) ;

	public List<Product> getAllProducts();



	public Product getProductById(Long id);

	public void deleteProductById(Long id);
	public List<Product>getProductBypagination(int pagegno,int pgsize);

	public void patch(Product product);
}
