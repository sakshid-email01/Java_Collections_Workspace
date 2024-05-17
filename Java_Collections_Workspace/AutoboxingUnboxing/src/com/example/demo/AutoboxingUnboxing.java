package com.example.demo;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(25); //Autoboxing
		System.out.println(numbers.get(0)); // unboxing  
		
		ArrayList<Float> demoListFloat = new ArrayList<>();
		demoListFloat.add(12.0f);
		System.out.println(demoListFloat.get(0));
		
	}

}
