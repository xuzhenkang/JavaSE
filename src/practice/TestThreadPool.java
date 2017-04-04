package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(2);
		e.submit(new MyRunnable2());
		e.submit(new MyRunnable2());
		e.shutdown();
	}
}
class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 999; i++)
			System.out.println(Thread.currentThread().getName() + "..." + i);
	}
	
}