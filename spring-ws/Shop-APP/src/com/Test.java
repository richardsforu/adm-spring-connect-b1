package com;

import com.bill.BillingImpl;
import com.price.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String cart1[] = { "Item1", "Item2", "Item3" };
		String cart2[] = { "Item1", "Item2"};
		
		//----------------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl(); // dependency class object
		//-----------------------------------------------
		
		BillingImpl biller = new BillingImpl(); // dependent class object
		
		biller.setPrice(price); // DI (Injecting dependency object (price) to the dependency object (biller) : DI
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
