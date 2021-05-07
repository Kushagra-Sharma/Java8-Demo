package com.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class StreamsExample1 {

	public static void main(String[] args) {

		// create a map of name & courses of instructor who teaches online and have
		// exp>5

		Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 5;

		List<Instructor> list = Instructors.getAll();

		Map<String, List<String>> map = list.stream().filter(p1.and(p2))
				.collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
		System.out.println(map);
	}

}
