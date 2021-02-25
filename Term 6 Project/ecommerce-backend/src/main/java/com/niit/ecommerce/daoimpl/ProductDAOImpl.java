package com.niit.ecommerce.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

@Repository(value = "productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		sessionFactory.getCurrentSession().delete(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return true;
	}

	@Override
	public Product getProductById(int id) {

		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public List<Product> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Product");
		List<Product> list = query.list();
		return list;
	}

}
