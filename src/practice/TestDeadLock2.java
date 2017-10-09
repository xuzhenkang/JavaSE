package practice;

public class TestDeadLock2 {
	public static void main(String[] args) {

		String lock1 = "lock1";
		String lock2 = "lock2";

		new Thread(() -> {
			while (true)
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName() + "持有了" + lock1 + "对象.");
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() + "持有了" + lock2 + "对象.");
					}
				}
		}).start();
		new Thread(() -> {
			while (true)
				synchronized (lock2) {
					System.out.println(Thread.currentThread().getName() + "持有了" + lock2 + "对象.");
					synchronized (lock1) {
						System.out.println(Thread.currentThread().getName() + "持有了" + lock1 + "对象.");
					}
				}
		}).start();

	}
}
