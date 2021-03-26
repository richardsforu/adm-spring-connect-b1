package com.bill;

import com.price.PriceMatrixImpl;

//dependent
public class BillingImpl {
	
	
	/*
	 * Design Issues
	 * -------------------
	 * 
	 * --> too many dependency class object creations. 
	 * 		-> per of application goes down
	 * 		-> memory management issues
	 * 
	 *  why these issues happened?
	 *  ------------------------------
	 *  -> dependent class itself creating dependency class object directly
	 *  
	 * What is the solution?
	 * -----------------------
	 * 	-> do not create dependency class object directly in the dependent class
	 * 	-> instead, use techniques like JNDI(Java Naming Directory Interface).
	 * 		-> Location of JNDI is tightly coupled with dependent class.
	 * 
	 *   What is the best solution?
	 *   -----------------------------
	 *   -
	 *   > do not create, or use any look up techniques, instead ask some one (container) to inject/pass:: IoC (Inversion of Control)
	 *   
	 *   How to implement IOC here?
	 *   ------------------------------
	 *   1. use dependency injection technique (DI)
	 *   
	 *   What is Dependency Injection?
	 *   --------------------------------
	 *   -> Injecting dependency object to the dependent object is DI
	 *   
	 *   In how many ways DI can be implemented?
	 *   --------------------------------------------
	 *   two ways
	 *   	1. using setter based injection : 
	 *   	2. using constructor based injection
	 *   
	 *   1. using setter based injection : 
	 *   -------------------------------------
	 *   Rules
	 *   -------
	 *   	1. Define dependency class object reference in dependent class, at class level
	 *   	2. create setter for the above defined reference object.
	 *   
	 */
	
	
	private PriceMatrixImpl price;  // dependency object reference

	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}
	
	
	
	//public BillingImpl(PriceMatrixImpl price) {
		
		//this.price = price;
	//}



	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

	

}
