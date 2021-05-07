package com.functionalprogramming.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class BiPredicateExample {

	public static void main(String[] args) {
		
List<Instructor> instructors = Instructors.getAll();
		
//		//All Instructor who teaches online
//		Predicate<Instructor> p1 = x -> x.isOnlineCourses() ==true;
//		
//		//Exp more than 5 years
//		Predicate<Instructor> p2 = x-> x.getYearsOfExperience() > 5;
//		
		
		//BiPredicate : 2 paramaters in predicate
		BiPredicate<Boolean, Integer> p3 = (onlineCourse,exp) -> onlineCourse==true && exp>5;
		
		
		//Biconsumer to print name and courses.
		BiConsumer<String, List<String>> bc1 = (x,y) -> System.out.println("Name is: "+x+" and courses are: "+y);
		
		instructors.forEach(i -> {
			if(p3.test(i.isOnlineCourses(),i.getYearsOfExperience())) {
				bc1.accept(i.getName(), i.getCourses());
			}
		});
	}
}
