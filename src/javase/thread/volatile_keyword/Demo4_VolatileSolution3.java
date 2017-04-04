package javase.thread.volatile_keyword;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h4>采用AtomicInteger的方式</h4>
 * <p>
 * 在java 1.5的java.util.concurrent.atomic包下提供了一些原子操作类，即对基本数据类型的
 * 自增（加1操作），自减（减1操作）、以及加法操作（加一个数），减法操作（减一个数）进行了封装，保证这些操作是原子性操作。atomic是利用CAS来实现原子性操作的（Compare
 * And Swap），CAS实际上是利用处理器提供的CMPXCHG指令实现的，而处理器执行CMPXCHG指令是一个原子性操作。
 * </p>
 * 
 * @author Kang
 *
 */
public class Demo4_VolatileSolution3 {
	public AtomicInteger inc = new AtomicInteger();

	/**
	 * volatile关键字能保证可见性没有错，但是上面的程序错在没能保证原子性。可见性只能保证每次读取的是最新的值，但是volatile没办法保证对变量的操作的原子性。
	 */
	public void increase() {
		this.inc.getAndIncrement();// 这是具有原子性的自增操作
	}

	AtomicInteger a;

	public static void main(String[] args) {

		final Demo4_VolatileSolution3 t = new Demo4_VolatileSolution3();

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

	public AtomicInteger getInc() {
		return inc;
	}

}
