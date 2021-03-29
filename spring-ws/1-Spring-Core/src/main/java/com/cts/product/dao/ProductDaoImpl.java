package com.cts.product.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Lazy
public class ProductDaoImpl {

	public ProductDaoImpl() {
		System.out.println(">>>> ProductDaoImpl class object created >>>>");
	}

}
