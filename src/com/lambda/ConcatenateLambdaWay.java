package com.lambda;

public class ConcatenateLambdaWay {
	
	public static void main(String[] args) {
		
		ConcatenateInterface i = (x,y) -> x+" "+y;
		
		System.out.println("Concatination is "+i.concat("Hello", "World"));
	}

}
