package com.cts.product;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // input scource

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService productService = ac.getBean(ProductService.class);

		Product product = new Product();
		product.setName("IPOD");
		product.setPrice(65000);
		product.setDescription("IPOD AIR");

		// productService.save(product);

		// productService.findAll().forEach(System.out::println);

		/*
		 * 
		 * Product prod = productService.findById(15);
		 * 
		 * if (prod != null) { prod.setPrice(4500); productService.update(prod);
		 * System.out.println(prod); } else {
		 * System.out.println("Id does not found in Database...."); }
		 * 
		 */

		System.out.println("Enter ID to Delete:  ");
		int id = sc.nextInt();

		Product prod = productService.findById(id);

		if (prod != null) {
			productService.delete(prod);

		} else {
			System.out.println(id + " not not found in database..");
		}

	}

}
