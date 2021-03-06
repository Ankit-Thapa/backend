package com.demoproject.shopping.service;

import java.util.List;


import com.demoproject.shopping.entity.ProductCategory;

public interface ProductCategoryService {

	public List<ProductCategory> getAllProductCategory();

	public ProductCategory getProductCategory(int id);

	public void saveProductCategory(ProductCategory productCategory);

	public void update(ProductCategory productCategory);

	public void deleteProductCategoryById(int id);

}
