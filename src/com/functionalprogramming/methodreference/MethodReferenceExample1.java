package com.functionalprogramming.methodreference;

import java.util.function.Function;
import java.util.function.Predicate;

import com.functionalprogramming.Instructor;

public class MethodReferenceExample1 {
	
	/*Method Reference in shortHand notation of lambda expression to call method
	 * Used to replace single method lambda exp
	 * Types of MEthod reference : 
	 * 1.Reference to static method ---> Class::staticMethod 
	 * 2.Reference to instance method ----> object::instanceMethod
	 * 3. Reference to Constructor ------> Class::new
	 */

	public static void main(String[] args) {
		
		Function<Integer, Double> f1 = n -> Math.sqrt(n);  // Normal Way
		Function<Integer, Double> f2 = Math::sqrt;		 //Method Reference
		
		System.out.println("F1 is "+f1.apply(25)+" F2 is "+f2.apply(25));
		
		Function<String, String> f3 = x-> x.toUpperCase();
		Function<String, String> f4 = String::toUpperCase;
		
		System.out.println("F3 is "+f3.apply("kush")+" F4 is "+f4.apply("sharma"));
		
		
		Predicate<Instructor> p1 = i -> i.isOnlineCourses() ==true;
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		
		
		
		
	}
}
