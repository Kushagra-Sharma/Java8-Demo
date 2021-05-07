package com.functionalprogramming.biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class BiConsumerExample2 {
	
	public static void main(String[] args) {
		
		List<Instructor> instructors = Instructors.getAll();
		
		//Case1 : Name and Gender of Instructor
		
		BiConsumer<String, String> b1 = (name,gender) -> System.out.println("Name is "+name+" & Gender is "+gender);
		
		instructors.forEach((i) -> 
		b1.accept(i.getName(), i.getGender())
		);
		System.out.println("---------------------------------");
		
		//Case2 :  Print name & List of courses
		BiConsumer<String, List<String>> b2 = (name,courses) -> System.out.println("Name is "+name+" & courses are "+courses);
		
		 instructors.forEach(i ->
		 b2.accept(i.getName(), i.getCourses()));
		System.out.println("---------------------------------");
		
		//Case 3: Print name & gender of instructor who has onlineCourses=true
		
		instructors.forEach(i -> {
		 if(i.isOnlineCourses()) {
			 b1.accept(i.getName(), i.getGender());
		 }
		});
		 
			 
	}

}
