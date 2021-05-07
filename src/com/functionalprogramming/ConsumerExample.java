package com.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

	
	public static void main(String[] args) {
		
		//Consumer Interface takes in an argument & performs the operation & return nothing
		
		Consumer<String> c = (x) -> System.out.println(x.length() + " Value of x: "+x);
		c.accept("Kushagra Sharma");
		
		
		//Consumer with block statement
		Consumer<Integer> d = (x) -> {
			System.out.println("x*x = "+x*x);
			System.out.println("x/x = "+x/x);
		};
		
		d.accept(10);
	}
	
}
