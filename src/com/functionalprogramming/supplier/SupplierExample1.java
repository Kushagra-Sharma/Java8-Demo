package com.functionalprogramming.supplier;

import java.util.function.Supplier;

public class SupplierExample1 {

	//Supplier Interface : Does not take any input but returns a value
	//Can also be called as Factory Interface and is reverse of CONSUMER INTERFACE
	
	public static void main(String[] args) {
		
		Supplier<Integer> s1 = () ->(int) (Math.random()*1000);
		System.out.println(s1.get());
	}
}
