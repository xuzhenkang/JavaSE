package javase.thread.volatile_keyword;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h4>采用Lock的方式</h4>
 * @author Kang
 *
 */
public class Demo3_VolatileSolution2 {
	private volatile int inc = 0;
	Lock lock = new ReentrantLock();
	/**
	 * volatile关键字能保证可见性没有错，但是上面的程序错在没能保证原子性。可见性只能保证每次读取的是最新的值，但是volatile没办法保证对变量的操作的原子性。
	 */
	public synchronized void increase() {
		lock.lock();
		try {
			this.inc++; // 自增操作不是原子性操作！因此导致结果不正确
		} finally {
			lock.unlock();
		}
	}

	AtomicInteger a;

	public static void main(String[] args) {

		final Demo3_VolatileSolution2 t = new Demo3_VolatileSolution2();

		for (int i = 0; i < 100; i++) {
			new Thread() {

				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						t.increase();
					}
				}

			}.start();
		}

		while (Thread.activeCount() > 1) { // 保证前面的线程都执行完
			Thread.yield();
		}
		System.out.println(t.getInc());
	}

	public int getInc() {
		return inc;
	}
}
