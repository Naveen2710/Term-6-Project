package com.niit.ecommerce.driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

public class ProductDriver {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.ecommerce");
		context.refresh();
		// 1. Insert the Product
		Product product = new Product("Smart Watch", 2500, 5, "15/01/2021", "15/01/2023", "OnePlus Smart Watch");

		ProductDAO dao = (ProductDAO) context.getBean("productDAO");

		dao.addProduct(product);

		// 2. Update the product
		// 2.1 get the Product Object by using getProductById()
		// 2.2 Update the Object by using set methods and use update() on the Object

//		Product prod = dao.getProductById(2);
//		prod.setExpiryDate("18/01/2025");
//
//		dao.updateProduct(prod);

		// 3. Delete the product
		// 3.1 get the Product Object by using getProductById()
		// 2.2 Delete the Object by using set methods and use delete() on the Object

//		Product prodDelete = dao.getProductById(1);
//
//		dao.deleteProduct(prodDelete);
		
		
		// 4 Get all the Products
		
//		List<Product> products = dao.findAll();
//		
//		for(Product p : products) {
//			System.out.println(p);
//		}

	}

}
