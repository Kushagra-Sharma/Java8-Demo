package com.functionalprogramming.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
	
	public static void main(String[] args) {
		
		IntPredicate p1 = (x) -> x>100;
		System.out.println(p1.test(101));
		
		LongPredicate p2 = x -> x>100L;
		System.out.println(p2.test(101L));
		
		DoublePredicate p3 = x-> x>101.12;
		System.out.println(p3.test(102.11));
	}

}
