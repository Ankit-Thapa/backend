package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.Product;
import com.demoproject.shopping.entity.ProductCategory;
import com.demoproject.shopping.repository.ProductCategoryRepository;
import com.demoproject.shopping.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository ProductCategoryRepository;
	
	@Override
	public List<ProductCategory> getAllProductCategory(){
			List<ProductCategory> productCategory = new ArrayList<ProductCategory>();  
			ProductCategoryRepository.findAll().forEach(productData -> productCategory.add(productData));  
			System.out.println(productCategory);
			return productCategory;
	}
	@Override
	public ProductCategory getProductCategory(int id) {
		return ProductCategoryRepository.findById(id).get(); 
	}
	@Override
	public void saveProductCategory(ProductCategory productCategory) {
		ProductCategory data=ProductCategoryRepository.save(productCategory);  
	}
	
	@Override
	public void update(ProductCategory productCategory) {
		ProductCategory data = ProductCategoryRepository.findById(productCategory.getId());

		data.setName(productCategory.getName());

		ProductCategoryRepository.save(data);

	}
	@Override
	public void deleteProductCategoryById(int id) {
		ProductCategoryRepository.deleteById(id);  
	}
}
