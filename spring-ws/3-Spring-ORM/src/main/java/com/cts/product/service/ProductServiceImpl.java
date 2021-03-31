package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public void save(Product product) {
		prodDao.save(product);

	}

	@Override
	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Override
	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	@Transactional
	public void update(Product product) {
		prodDao.update(product);

	}

	@Override
	@Transactional
	public void delete(Product product) {
		prodDao.delete(product);

	}

}
