package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class cf4 {
	public static void main(String[] args) {
//		Queue<String> que = new LinkedList<>();
//
//		que.offer("Raj");
//		que.offer("Avinaw");
//		que.offer("Gaurav");
//
//		System.out.println(que);
//
//		System.out.println(que.element());
//
//		que.poll();
//
//		System.out.println(que);

//		Queue<Integer> que = new PriorityQueue<Integer>();
//
//		que.add(30);
//		que.add(10);
//		que.add(20);
//
//		System.out.println(que);
//		
//		System.out.println(que.poll()); // remove smallest 

		Deque<Integer> deque = new ArrayDeque<Integer>();

		deque.add(50);
		deque.addFirst(10);
		deque.add(40);
		deque.addFirst(90);
		deque.addLast(100);
		
		// 90 10 50 40 100
		System.out.println(deque);
		
		

	}
}
