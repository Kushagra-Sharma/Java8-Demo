package com.lambda;

import java.util.List;
import java.util.function.IntConsumer;

import com.functionalprogramming.Instructor;
import com.functionalprogramming.Instructors;

public class VariableScopeExample {
	
	static int j=0;
	
	public static void main(String[] args) {
		
		int n = 10; //Local variable
		IntConsumer c1 = (a) -> System.out.println(a*10);
		
		int k=0;			//treated as final inside LAmbda expression
		List<Instructor> instructors = Instructors.getAll();
		instructors.forEach(i ->{
		//	System.out.println(i +""+k++ +""+j++);    //Line has error on k++ coz its not final and value changes
		});
	}

}
