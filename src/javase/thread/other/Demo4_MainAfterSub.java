package javase.thread.other;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * 需求：java主线程等待所有子线程执行完毕再执行。
 * 这个需求其实我们在工作中经常会用到，比如用户下单一个产品，后台会做一系列的处理，为了提高效率，每个处理都可以用一个线程来执行，所有处理完成了之后才会返回给用户下单成功
 * 
 * @author Dan
 *
 */
public class Demo4_MainAfterSub {
	// 用sleep方法，让主线程睡眠一段时间，当然这个睡眠时间是主观的时间，是我们自己定的，这个方法不推荐，但是在这里还是写一下，毕竟是解决方法
	public static void method1() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("子线程执行!");
				}
			}).start();
		}
		Thread.sleep(5000);
		System.out.println("主线程执行!");
	}
	// 使用Thread的join()等待所有的子线程执行完毕，主线程在执行。
	// thread.join()把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。
	// 比如在线程B中调用了线程A的join()方法，直到线程A执行完毕后，才会继续执行线程B。
	public static void method2() throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("子线程执行!");
				}
			});
			threads[i].start();
		}
		for (int i = 0; i < 5; i++)
			threads[i].join();
		System.out.println("主线程执行!");
	}
	// 等待多线程完成的CountDownLatch
	// 在这里说明一点，countDownLatch不可能重新初始化或者修改CountDownLatch对象内部计数器的值，一个线程调用countdown方法happen-before另外一个线程调用await方法
	public static void method3() throws InterruptedException {
		final CountDownLatch latch = new CountDownLatch(5);
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("子线程执行!");
					latch.countDown(); // 让latch中的数值减1
				}
			}).start();
		}
		latch.await(); // 阻塞当前线程直到latch中的值为0
		System.out.println("主线程执行!");
	}
	// 同步屏障CyclicBarrier
	public static void method4() throws InterruptedException, BrokenBarrierException {
		final CyclicBarrier barrier = new CyclicBarrier(5);
		for (int i = 0; i < 4; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("子线程执行!");
					try {
						barrier.await(); // 到达屏障
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
		}
		barrier.await();
		System.out.println("主线程执行!");
	}
	
	
	/*
	 * countDownLatch和cyclicBarrier有什么区别呢，
	 * 他们的区别：countDownLatch只能使用一次，而CyclicBarrier方法可以使用reset()方法重置，所以CyclicBarrier方法可以能处理更为复杂的业务场景。
	 * 我曾经在网上看到一个关于countDownLatch和cyclicBarrier的形象比喻，
	 * 就是在百米赛跑的比赛中若使用 countDownLatch的话冲过终点线一个人就给评委发送一个人的成绩，
	 * 10个人比赛发送10次，如果用CyclicBarrier，则只在最后一个人冲过终点线的时候发送所有人的数据，仅仅发送一次，这就是区别。
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("方法1");
		method1();
		System.out.println("方法2");
		method2();
		System.out.println("方法3");
		method3();
		System.out.println("方法4");
		method4();
	}
}
