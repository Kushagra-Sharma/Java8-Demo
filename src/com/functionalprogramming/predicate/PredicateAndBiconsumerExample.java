package com.functionalprogramming.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class PredicateAndBiconsumerExample {
	
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
		
		//All Instructor who teaches online
		Predicate<Instructor> p1 = x -> x.isOnlineCourses() ==true;
		
		//Exp more than 5 years
		Predicate<Instructor> p2 = x-> x.getYearsOfExperience() > 5;
		
		//Biconsumer to print name and courses.
		BiConsumer<String, List<String>> bc1 = (x,y) -> System.out.println("Name is: "+x+" and courses are: "+y);
		
		instructors.forEach(i -> {
			if(p1.and(p2).test(i)) {
				bc1.accept(i.getName(), i.getCourses());
			}
		});
	}

}
