package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class FlatMapExample1 {
	
	public static void main(String[] args) {
		
		//Flat Map is combination of Map + Flat operation , used to flatten stream
		
		//Get a list of all courses instructor offers
		
		List<Instructor> list = Instructors.getAll();
		
		List<String> courseList = list.stream()
				.map(x->x.getCourses())
				.flatMap(x -> x.stream())			//List<String>:: stream : Converts List<List<String> to List<Stirng>
				.collect(Collectors.toList());
		
		System.out.println(courseList);
	}

}
