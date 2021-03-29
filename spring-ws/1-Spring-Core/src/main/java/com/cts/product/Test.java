package com.cts.product;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		System.out.println(">>>>> Main Method <<<<<");
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

		// default all beans are enabled with eager initialization
	
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);
		ProductServiceImpl ps2 = ac.getBean(ProductServiceImpl.class);

		// spring scopes ... singleton / prototype / global-session / application / request
		// by default all beans have singleton scope enabled..
		
		ps.save();
		ps1.save();
		ps2.save();
		
		
		
		
		
	}

}
