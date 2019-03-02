package thread.test;

public class Test {
	public static void main(String[] args) {
		Sync s = new Sync();
		MyThread thread1 = new MyThread(s, "线程1");
		thread1.start();
		MyThread thread2 = new MyThread(s, "线程2");
		thread2.start();
		MyThread thread3 = new MyThread(s, "线程3");
		thread3.start();
		MyThread thread4 = new MyThread(s, "线程4");
		thread4.start();
	}
}
