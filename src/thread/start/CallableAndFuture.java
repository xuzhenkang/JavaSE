package thread.start;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable和Future，它俩很有意思的，一个产生结果，一个拿到结果。
 * Callable接口类似于Runnable，从名字就可以看出来了，但是Runnable不会返回结果，
 * 并且无法抛出返回结果的异常，而Callable功能更强大一些，被线程执行后，可以返回值，
 * 这个返回值可以被Future拿到，也就是说，Future可以拿到异步执行任务的返回值， 下面来看一个简单的例子：
 * 
 * @author kang
 *
 */
public class CallableAndFuture {
	public static void main(String[] args) {
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return new Random().nextInt(100);
			}
		};
		FutureTask<Integer> future = new FutureTask<Integer>(callable);
		new Thread(future).start();
		try {
			Thread.sleep(5000);// 可能做一些事情
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}