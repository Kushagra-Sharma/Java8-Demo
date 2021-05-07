package com.lambda;

public class HelloWorldLambdaWay {
	
	public static void main(String[] args) {
		//Way 1
		HelloWorldInterface i = () -> {
			return "Hello World LAmbda way";
			};
		
		//Way 2
		HelloWorldInterface j = () -> "Hello World Lambda Way 2";	
			
			
	System.out.println(i.sayHelloWorld()+"\n\n"+j.sayHelloWorld());
	}

}
