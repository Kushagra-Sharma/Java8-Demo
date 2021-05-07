package com.streams;

import java.util.Optional;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class StreamReduceExample2 {
	public static void main(String[] args) {
		
		//printing name of instructor who has highest year of exp.
		
		Optional i= Instructors.getAll().stream().reduce((s1,s2) -> {
			if(s1.getYearsOfExperience()>s2.getYearsOfExperience())
				return s1;
			else
				return s2;
		});
		
		System.out.println(i.get());
	}
}
