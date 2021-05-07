package com.functionalprogramming.function;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class BiFunctionExample {
	public static void main(String[] args) {

		/* BiFunction take 2 parameter as input and return the result */

		// Concat 2 strings
		BiFunction<String, String, String> concatFunc = (x, y) -> x + " " + y;
		System.out.println(concatFunc.apply("Kush", "Sharma"));

		// I/P : List<Inst> and Predicate : which will fill onlineCourse == true &
		// return MAp<String,Integer>

		Predicate<Instructor> p = x -> x.isOnlineCourses() == true;

		BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunc = (instructors, predi) -> {
			Map<String,Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				if(predi.test(instructor)) {
					map.put(instructor.getName(), instructor.getYearsOfExperience());
				}
			});
			return map;
		};
		
		System.out.println(biFunc.apply(Instructors.getAll(), p));
	}
}
