package com.functionalprogramming.methodreference;

import java.util.function.Predicate;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class ConvertToMethodRefrenceExample {
	
	public static void main(String[] args) {
		
		//Exp more than 10 years
		Predicate<Instructor> p1 = i -> i.getYearsOfExperience() > 10;
		
		Predicate<Instructor> p2 = ConvertToMethodRefrenceExample::greaterThanTenYearsExp;
		
		Instructors.getAll().forEach(instructor ->
		{
			if(p2.test(instructor)) {
				System.out.println(instructor);
			}
		});
		
	}
	
	public static boolean greaterThanTenYearsExp(Instructor inst) {
		if(inst.getYearsOfExperience()  >10) {
			return true;
		}
		return false;
	}
}
