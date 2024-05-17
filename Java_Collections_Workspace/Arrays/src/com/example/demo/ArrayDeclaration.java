package com.example.demo;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int[] intVariableArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(intVariableArray[5]);

		float[] floatVariableArray = { 0.0f, 1.0f, 2.0f, 3.0f, 4.0f };
		System.out.println(floatVariableArray[4]);

		String[] stringArray = { "Fruits", "Vegetables" };

		for (int i = 0; i <= stringArray.length - 1; i++) {
			System.out.println(stringArray[i]);
		}
		
		for(String name: stringArray){
			System.out.println(name);
		}	
	}

}
