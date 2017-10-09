package practice;

public class TestDeadLock2 {
	public static void main(String[] args) {

		String lock1 = "lock1";
		String lock2 = "lock2";

		new Thread(() -> {
			while (true)
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName() + "������" + lock1 + "����.");
					synchronized (lock2) {
						System.out.println(Thread.currentThread().getName() + "������" + lock2 + "����.");
					}
				}
		}).start();
		new Thread(() -> {
			while (true)
				synchronized (lock2) {
					System.out.println(Thread.currentThread().getName() + "������" + lock2 + "����.");
					synchronized (lock1) {
						System.out.println(Thread.currentThread().getName() + "������" + lock1 + "����.");
					}
				}
		}).start();

	}
}
