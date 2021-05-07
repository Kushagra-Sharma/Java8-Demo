package com.lambda;

public class RunnableExampleTraditional {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum = 0;
				for(int i=0;i<5;i++) {
					sum=sum+i;
					}
				System.out.println("Traditional Sum :"+sum);
				
			}
		};
		new Thread(runnable).start();
		
		
		//Lambdaaaaaa
		Runnable r2 = () -> {
			int sum = 0;
			for(int i=0;i<4;i++) {
				sum = sum+i;
			}
			System.out.println("Lambda Sum: "+sum);
		};
		
		new Thread(r2).start();
		
		
		// Thread with Lambda
		
		new Thread (() -> {
			int sum = 0;
			for(int i=0;i<6;i++) {
				sum = sum+i;
			}
			System.out.println("LambdaWay2 Sum: "+sum);
		}).start();
	}
}
