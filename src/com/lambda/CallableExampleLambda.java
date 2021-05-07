package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CallableExampleLambda {

	static int[] arr = IntStream.rangeClosed(0, 5000).toArray();
	static int total = IntStream.rangeClosed(0, 5000).sum();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable c1 = () -> {
			int sum = 0;
			for (int i = 0; i < arr.length / 2; i++) {
				sum = sum + arr[i];
			}
			return sum;
		};
		
		Callable c2 = () -> {
			int sum = 0;
			for (int i = arr.length / 2; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		};

		ExecutorService service = Executors.newFixedThreadPool(2);
		List<Callable<Integer>> taskList = Arrays.asList(c1, c2);
		List<Future<Integer>> result = service.invokeAll(taskList);

		int k = 0, sum = 0;
		for (Future<Integer> f : result) {
			sum = sum + f.get();
			System.out.println("Sum of " + ++k + " is " + f.get());
		}
		System.out.println("Sum from callable is " + sum);
		System.out.println("Total sum is " + total);
		service.shutdown();
	}
}