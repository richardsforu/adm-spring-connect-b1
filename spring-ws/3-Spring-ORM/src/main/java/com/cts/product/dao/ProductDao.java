package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	void save(Product product);

	Product findById(int id);

	List<Product> findAll();

	void update(Product product);

	void delete(Product product);

}