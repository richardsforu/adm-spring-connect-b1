package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cts.product.service,com.cts.product.dao")


//@ComponentScans(value = { @ComponentScan(value = "com.cts.product.service"),
		//@ComponentScan(value = "com.cts.product.dao") })
public class AppConfig {

	public AppConfig() {
		System.out.println("--- AppConfig class object created...");
	}

	@Bean
	public void f1() {
		System.out.println(">>>> f1 method of AppConfig class got executed.. ");
	}

}
