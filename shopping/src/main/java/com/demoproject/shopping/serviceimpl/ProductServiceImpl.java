package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.repository.ProductRepository;
import com.demoproject.shopping.repository.UserRepository;
import com.demoproject.shopping.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository ProductRepository;

	@Override
	public void saveProduct(Product product) {
		Product data=ProductRepository.save(product);  
	}
	
	@Override
	public List<Product> getAllProducts(){
		List<Product> product = new ArrayList<Product>();  
		ProductRepository.findAll().forEach(productData -> product.add(productData));  
		System.out.println(product);
		return product;
	}
	
	@Override
	public List<Product>getProductBypagination(int pageno,int pgsize){
		Pageable paging=PageRequest.of(pageno, pgsize);
		Page<Product> result=ProductRepository.findAll(paging);
		return result.toList();
	}
	
	
	@Override
	public Product getProductById(Long id) {
		return ProductRepository.findById(id).get();
	}
	@Override
	public void deleteProductById(Long id) {
		ProductRepository.deleteById(id);  
	}
	
	@Override
	public void patch(Product product) {
		Optional<Product> optionalData=ProductRepository.findById(product.getId()); 
		if(!optionalData.isEmpty()) {
		Product data=optionalData.get();
		data.setName(product.getName());
		data.setPrice(product.getPrice());
		data.setProductCategoryId(product.getProductCategoryId());
		data.setDetail(product.getDetail());
		data.setFeature(product.getFeature());
		data.setDateModified(new Date());
		ProductRepository.save(data);
		System.out.println(data);
	}
	}

	
}
