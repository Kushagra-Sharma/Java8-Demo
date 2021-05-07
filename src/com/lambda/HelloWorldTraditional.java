package com.lambda;

public class HelloWorldTraditional implements HelloWorldInterface{

	@Override
	public String sayHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
	
	public static void main(String[] args) {
		HelloWorldTraditional t = new HelloWorldTraditional();
		System.out.println(t.sayHelloWorld());
	}

}
