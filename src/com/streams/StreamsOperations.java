package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class StreamsOperations {
	
	public static void main(String[] args) {
		
		//count() 		//distinct

		
		List<Instructor> list = Instructors.getAll();
		
		Long courseCount = list.stream()
				.map(x->x.getCourses())
				.flatMap(x -> x.stream())			//List<String>:: stream : Converts List<List<String> to List<Stirng>
				.distinct()
				.count();
		
		System.out.println(courseCount);
		
	}

}
