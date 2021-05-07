package com.functionalprogramming;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {

	public static void main(String[] args) {
		
		//SPL type of consumers that take specific dataTypes as input
		
		
		IntConsumer intC = (x) -> System.out.println(x*10);
		intC.accept(10);
		
		LongConsumer longC = (x) -> System.out.println(x*200);
		longC.accept(10L);
		
		DoubleConsumer doubleC = (x) -> System.out.println(x*50);
		doubleC.accept(5.5);
		
	}
}
