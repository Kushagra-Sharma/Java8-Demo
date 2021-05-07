package com.functionalprogramming.function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample1 {
	
	//UnaryOperator is a spl function : takes i/p single param and return param of same type
		
	public static void main(String[] args) {
		
		
		//Case 1: String concat
		UnaryOperator<String> op1 = x-> x+" world";
		System.out.println(op1.apply("Hello"));
	
		//Case 2: Integer multiplication
		UnaryOperator<Integer> op2 = x-> x*10;
		System.out.println(op2.apply(2));
		
		//
		IntUnaryOperator op3 = x-> x*100;
		System.out.println(op3.applyAsInt(2));

	
	}
	
	
}
