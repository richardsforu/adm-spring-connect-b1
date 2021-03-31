package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void save(Product product) {
		sf.getCurrentSession().save(product);
	}

	@Override
	public Product findById(int id) {
		return sf.getCurrentSession().get(Product.class, id);
	}

	@Override
	public List<Product> findAll() {
		return sf.getCurrentSession().createQuery("from Product").getResultList();
	}

	@Override
	public void update(Product product) {
		sf.getCurrentSession().update(product);
	}

	@Override
	public void delete(Product product) {
		sf.getCurrentSession().delete(product);
	}

}
