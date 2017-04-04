package practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
/*		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = pool.submit(new MyCallable(100));
		Future<Integer> f2 = pool.submit(new MyCallable(50));
		System.out.println(f1.get());
		System.out.println(f2.get());
		pool.shutdown();*/
		FutureTask<Integer> ft1 = new FutureTask<>(new MyCallable(100));
		FutureTask<Integer> ft2 = new FutureTask<>(new MyCallable(50));
		new Thread(ft1, "myThread1").start();
		new Thread(ft2, "myThread2").start();
		System.out.println(ft1.get());
		System.out.println(ft2.get());

	}
}

class MyCallable implements Callable<Integer> {

	private int num;
	
	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		return sum;
	}

}