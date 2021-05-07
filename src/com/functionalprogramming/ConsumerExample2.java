package com.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
	
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
		
		//Case 1 :Looping through all instructor and printing out the instructors.
		
		Consumer<Instructor> c1 = (i) -> System.out.println(i);
		//forEach internally calls accept() of consumer
		instructors.forEach(c1);
		
		//Case 2 : Loop through all instructors and only print name
		
		Consumer<Instructor> c2 = (i) -> System.out.println(i.getName());
		instructors.forEach(c2);
		System.out.println("---------------------------------------");
		
		//Case 3: Loop through all instructor and print name & courses
		Consumer<Instructor> c3 = (i) -> System.out.println(i.getCourses());
		
		//concat or chain multiple operations using andThen()
		instructors.forEach(c2.andThen(c3));
		System.out.println("---------------------------------------");
		
		//Case 4: Loop through all instructor & print name if experience >10
		
		instructors.forEach(instructor -> {
			if(instructor.yearsOfExperience>10) {
				c1.accept(instructor);
			}
		});
		System.out.println("---------------------------------------");
		
		
		//Case 5: Loop through all inst & print name and exp if exp>5 & onlineCourses = true
		
		instructors.forEach(inst -> {
			if(inst.yearsOfExperience>5  && inst.onlineCourses==true) {
				c1.accept(inst);
			}
		});
	}

}
