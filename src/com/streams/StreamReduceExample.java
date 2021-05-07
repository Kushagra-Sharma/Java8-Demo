package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int results = num.stream()
				//0+1 = 1	(identity=a,b=coming from list)
				//1+2 = 3	
				//3+4 = 7 
				.reduce(0,(a,b)->a+b);		//0 = identity
		
		
		int results1 = num.stream().reduce(1,(a,b) -> a*b);
		
		
		//Optional can have value or maynot have value --- reduce(BinaryOperator<Integer> accumulator)
		Optional results2 = num.stream().reduce((a,b)->a+b);
		
		System.out.println(results);
		System.out.println(results1);
		System.out.println(results2);

	}

}
