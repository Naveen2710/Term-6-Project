package com.niit.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO dao;
	
	@RequestMapping("/display-products")
	public String productPage(Model model) {
        List<Product> productList = dao.findAll();
	    model.addAttribute("list", productList);
		return "products";
	}

}
