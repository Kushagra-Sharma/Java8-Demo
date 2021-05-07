package com.functionalprogramming.function;

import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class FunctionExample2 {
	public static void main(String[] args) {
		
		List<Instructor> list = Instructors.getAll();
		
		//Predicate to return true if Instructor has online courses
		Predicate<Instructor> p = i -> i.isOnlineCourses() == true;
		
		
		//Map of Instructors with name and experience 
		//Function will take List<Instructor> as argument & return Map<String, Integer>
		Function<List<Instructor>,Map<String, Integer>> f1 = (instructors)-> {
			Map<String,Integer> map = new HashMap<>();
			instructors.forEach(instructor -> {
				if(p.test(instructor))
				map.put(instructor.getName(), instructor.getYearsOfExperience());
			});
			return map;
		};
		System.out.println(f1.apply(list));
	}
}
