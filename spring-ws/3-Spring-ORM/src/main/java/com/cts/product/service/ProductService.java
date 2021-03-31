package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void save(Product product);

	Product findById(int id);

	List<Product> findAll();

	void update(Product product);

	void delete(Product product);

}
