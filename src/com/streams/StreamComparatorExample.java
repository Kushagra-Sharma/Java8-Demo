package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class StreamComparatorExample {
	
	public static void main(String[] args) {
		
		//return all instructor sorted by name
		List<Instructor> list = Instructors.getAll();
		
		List<Instructor> sortedNameList = list.stream()
				.sorted(Comparator.comparing(Instructor::getYearsOfExperience).reversed()).collect(Collectors.toList());
				
		sortedNameList.forEach(System.out::println);
	}

}
