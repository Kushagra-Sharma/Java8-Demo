package com.functionalprogramming.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
	
		/*BICONSUMER is same as consumer but takes 2 I/P parameters*/
		
		
		//Case 1: Sum of 2 number
		BiConsumer<Integer, Integer> b1 = (x,y) -> System.out.println(x+y);
		b1.accept(2, 4);
		
		//Case 2: Concate strings
		BiConsumer<String, String> b2 = (x,y) ->System.out.println(x+" "+y);
		b2.accept("Kushagra", "Sharma");
	}
}
