package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsVsCollectionExample {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Jack");
		names.add("Jill");
		names.add("Tom");
		
		System.out.println(names);
		
		names.remove("Tom");
		System.out.println(names);
		
		for(String n:names) {
			System.out.println(n);
		}
		
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		
	}

}
