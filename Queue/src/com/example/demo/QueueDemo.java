package com.example.demo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedBlockingQueue<>();
		System.out.println(queue.offer(1));
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue.offer(4));
		
		System.out.println("removed element from Queue: "+queue.poll());
		System.out.println("********************");
		System.out.println(queue.peek());
		
		for (Integer element : queue) {
			System.out.println(element);
		}
		
		Queue<Integer> queueVar = new ArrayBlockingQueue<>(6);
		queueVar.add(1);
		queueVar.add(2);
		queueVar.add(3);
		queueVar.add(4);

		for (Integer element : queueVar) {
			System.out.println(element);
		}
		
		
	}

}
