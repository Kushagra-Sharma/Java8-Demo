package com.streams;

import com.functionalprogramming.Instructors;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {

		// total years of exp between instructors who has online course

		long totalExp = Instructors.getAll().stream().filter(ins -> ins.isOnlineCourses())
				.map(x -> x.getYearsOfExperience())
				.reduce(0, (a, b) -> a + b);

		System.out.println(totalExp);

	}

}
