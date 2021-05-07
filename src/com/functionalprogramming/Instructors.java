package com.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	public static List<Instructor> getAll() {
		Instructor i1 = new Instructor("Mike", 10, "CSE", "M", true, Arrays.asList("Java","Python"));
		Instructor i2 = new Instructor("Jackie", 5, "IT", "F", false, Arrays.asList("Web Development","HTML/CSS"));
		Instructor i3 = new Instructor("Liam", 12, "Management", "M", true, Arrays.asList("Analytics","ML"));
		
		List<Instructor> list = Arrays.asList(i1,i2,i3);
		return list;
	}
}
