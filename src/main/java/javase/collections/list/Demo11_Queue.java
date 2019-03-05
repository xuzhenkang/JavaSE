package javase.collections.list;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * FIFO
 * @author lenovo
 *
 */
public class Demo11_Queue {
	public static void main(String[] args) {
		Queue<Integer> linkedListQueue = new LinkedList<>();
		linkedListQueue.add(12);
		linkedListQueue.add(13);
		linkedListQueue.add(14);
		linkedListQueue.add(15);
		for (Integer i : linkedListQueue)
			System.out.println(i);
		System.out.println("--------------");
		linkedListQueue.poll();
		for (Integer i : linkedListQueue)
			System.out.println(i);
		System.out.println("-------------");

		ArrayDeque<Integer> arrayListQueue = new ArrayDeque<>();
		arrayListQueue.add(22);
		arrayListQueue.add(23);
		arrayListQueue.add(24);
		arrayListQueue.add(25);
		for (Integer i : arrayListQueue)
			System.out.println(i);
		System.out.println("-------------");
	}
}
