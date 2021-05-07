package com.functionalprogramming.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class PredicateExample2 {
	
	public static void main(String[] args) {
		List<Instructor> instructors = Instructors.getAll();
		
		//All instructor who teach online.
		Predicate<Instructor> p1 = i -> i.isOnlineCourses() == true;
		instructors.forEach(i -> {
			if(p1.test(i)) {
				System.out.println(i);
			}
		});
		System.out.println("****************************************");
		
		//Exp more than 10 years
		Predicate<Instructor> p2 = i -> i.getYearsOfExperience() > 10;
		instructors.forEach(i -> {
			if(p2.test(i)) {
				System.out.println(i);
			}
		});
		System.out.println("****************************************");
		
		//Teaches online and more than 10 years of experinece
		instructors.forEach(i -> {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
		});
	}
}
