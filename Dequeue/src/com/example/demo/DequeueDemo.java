package com.example.demo;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeueDemo {

	public static void main(String[] args) {

		Deque<Integer> deque = new LinkedBlockingDeque<>();
		
		
		deque.offer(1);
		deque.offer(2);
		deque.offer(3);
		deque.offer(4);
		deque.offer(5);
		deque.offer(6);
		deque.offer(7);
	
	for(Integer element: deque){
		System.out.println(element);
	}
	System.out.println("********************");
	deque.addFirst(0);
	deque.removeLast();
	
	for(Integer element: deque){
		System.out.println(element);
	}
	
	
}
}
