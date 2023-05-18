package com.ty.springBoot_FoodApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springBoot_FoodApp.dao.ProductDao;
import com.ty.springBoot_FoodApp.dto.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product saveProduct(Product product) {
		return productDao.saveProduct(product);
	}
	public Product updateProduct(int id, Product product) {
		Product product2=productDao.updateProduct(id,product);
		if(product2!=null) {
			return product;
		}else {
			return null;
		}
	}
	public Product deleteProduct(int id) {
		Product product=productDao.deleteProduct(id);
		if(product!=null) {
			return product;
		}else {
			return null;
		}
	}
	public Product getProductById(int id) {
		Product product=productDao.getProductById(id);
		if(product!=null) {
			return product;
		}else {
			return null;
		}
	}
}
