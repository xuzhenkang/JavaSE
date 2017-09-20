package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(10);
		
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 0, 0, null, null);
		
	}
}
