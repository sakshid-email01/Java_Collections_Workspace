package com.example.demo;

import java.util.LinkedList;

public class LinkedListInitialization {

	public static void main(String[] args) {

		LinkedList<Integer> numbers1 = new LinkedList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
	    for (int i : numbers1) {
	      System.out.println(i);
	    }
	    
	    LinkedList<Integer> numbers2 = new LinkedList<Integer>();
	    numbers2.add(1);
	    numbers2.add(2);
	    numbers2.add(3);
	    numbers2.add(0, 4);
	    numbers2.set(3, 6);
	    numbers2.remove(1);
	    for (int i : numbers2) {
	      System.out.println(i);
	    }
	   

	}

}
