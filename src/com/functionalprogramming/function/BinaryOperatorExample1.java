package com.functionalprogramming.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample1 {
	
	/* BinaryOperator takes 2 parameter of same type and return a value of the same type*/
	
	public static void main(String[] args) {
		
		
		BinaryOperator<String> bo1 = (x,y) -> x+" "+y;
		
		BinaryOperator<Integer> bo2 = (x,y) -> x + y;
		
		System.out.println(bo1.apply("Kush", "Sharma"));
		System.out.println(bo2.apply(5, 2));
		
		Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		
		BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
		System.out.println(maxBi.apply(7,9));
		
		BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
		System.out.println(minBi.apply(7,9));
		
	}

}
