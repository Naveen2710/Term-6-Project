package com.niit.ecommerce.dao;

import java.util.List;

import com.niit.ecommerce.model.Product;

public interface ProductDAO {

	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProductById(int id);
	public List<Product> findAll();
}
