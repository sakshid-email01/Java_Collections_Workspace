package com.example.demo;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(1);
	    myNumbers.add(2);
	    myNumbers.add(3);
	    myNumbers.add(4);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}

}
