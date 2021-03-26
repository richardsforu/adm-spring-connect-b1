package com.price;

// Dependency
public class PriceMatrixImpl {
	
	
	/*
	 * Types of Objects
	 * 
	 * 2 types
	 * ----------
	 * 	1. dependency object:which never depends on any other objects. works independently
	 *  2. dependent object : always depends on dependency objects. 
	 *  
	 *  
	 * 
	 * 
	 */

	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl object created...");
	}

	public double getItemPrice(String itemCode) {

		// code to fetch price of given item code from database

		return 100.00;

	}

}
