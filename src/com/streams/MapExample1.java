package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class MapExample1 {
	
	public static void main(String[] args) {
		
		//.map() creates a new stream from existing stream by performing some operation 
		
		//return only instructor names from the instructor list.
		
		List<Instructor> list = Instructors.getAll();
		
		List<String> nameList = list.stream().map(x -> x.getName()).map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(nameList);
		
		
		
	}

}
