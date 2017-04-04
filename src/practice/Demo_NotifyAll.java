package practice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo_NotifyAll {
	public static void main(String[] args) {
		final Printer printer = new Printer();
		System.out.println("begin");
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						printer.print1();
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						printer.print2();
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						printer.print3();
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();
	}
}

class Printer {
	ReentrantLock r = new ReentrantLock();
	Condition c1 = r.newCondition();
	Condition c2 = r.newCondition();
	Condition c3 = r.newCondition();
	private int flag = 1;

	public void print1() throws InterruptedException {
		r.lock();
		if (flag != 1) {
			c1.await();
		}
		System.out.print("传");
		System.out.print("智");
		System.out.print("播");
		System.out.println("客");
		flag = 2;
		c2.signal();
		r.unlock();
	}

	public void print2() throws InterruptedException {
		r.lock();
		if (flag != 2) {
			c2.await();
		}
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.println("员");
		flag = 3;
		c3.signal();
		r.unlock();
	}

	public void print3() throws InterruptedException {
		r.lock();
		if (flag != 3) {
			c3.await();
		}
		System.out.print("i");
		System.out.print("t");
		System.out.print("c");
		System.out.print("a");
		System.out.print("s");
		System.out.println("t");
		flag = 1;
		c1.signal();
		r.unlock();
	}
}