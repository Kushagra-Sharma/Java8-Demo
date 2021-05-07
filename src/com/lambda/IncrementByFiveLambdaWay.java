package com.lambda;

public class IncrementByFiveLambdaWay {
	public static void main(String[] args) {
		
	IncrementByFiveInterface i = (x) -> {
		x=x+5;
		return x;
	};
	
	IncrementByFiveInterface j = (x) -> x+5;
	
	System.out.println("Lambda way "+i.incrementByFive(5));
	System.out.println("Lambda way2 "+j.incrementByFive(3));	
	}
}
