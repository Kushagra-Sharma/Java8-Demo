package com.functionalprogramming.predicate;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
	/*Predicate returns True or False for a single value I/P */
		
		//If num > 10 then return true or else false
		Predicate<Integer> p1 = (x) -> x>10;
		System.out.println(p1.test(11));
		
		//If n>10 && n is even
		Predicate<Integer> p2 = (x) ->x%2==0;
		System.out.println(p1.and(p2).test(21));
		
		//n>10 || n is even
		System.out.println(p1.or(p2).test(4));
		
		//n>0 && n is odd
		System.out.println(p1.and(p2.negate()).test(11));
	}

}
