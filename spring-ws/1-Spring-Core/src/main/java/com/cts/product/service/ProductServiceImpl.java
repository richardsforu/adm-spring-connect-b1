package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Lazy
@Scope("prototype")
public class ProductServiceImpl {
	public ProductServiceImpl() {
		System.out.println(">>>> ProductServiceImpl class object created on "+this.hashCode()+" <<<<<");
	}
	
	public void save() {
		System.out.println(">>>> save method of ProductServiceImpl class using "+this.hashCode()+" hashcode");
	}

}
