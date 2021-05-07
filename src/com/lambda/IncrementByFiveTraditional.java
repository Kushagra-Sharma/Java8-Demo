package com.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{

	@Override
	public int incrementByFive(int x) {
		x = x+5;
		return x;
	}
	
	public static void main(String[] args) {
		IncrementByFiveTraditional t = new IncrementByFiveTraditional();
		System.out.println(t.incrementByFive(2));
	}
	
	

}
