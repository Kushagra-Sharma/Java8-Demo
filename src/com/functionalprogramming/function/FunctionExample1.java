package com.functionalprogramming.function;

import java.util.function.Function;

public class FunctionExample1 {
	
	/*Function Interface :It represents a function which takes in 1 arg and return the result*/
	public static void main(String[] args) {
		
				//<I/P,O/P(return type)>
		Function<Integer, Double> sqrt = i -> Math.sqrt(i);
		System.out.println(sqrt.apply(64));
		
		Function<String,String> func2 = s -> s.toUpperCase();
		System.out.println(func2.apply("kush"));
		
		Function<String,String> f3 = s -> s.concat(" sharma");
		System.out.println(func2.andThen(f3).apply("kush"));   //UpperC then concat
		System.out.println(func2.compose(f3).apply("kush"));   //Concat then UpperC
	}
}
