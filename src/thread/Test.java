package thread;

public class Test {
	public static void main(String[] args) {
		Sync s = new Sync();
		MyThread thread1 = new MyThread(s, "�߳�1");
		thread1.start();
		MyThread thread2 = new MyThread(s, "�߳�2");
		thread2.start();
		MyThread thread3 = new MyThread(s, "�߳�3");
		thread3.start();
		MyThread thread4 = new MyThread(s, "�߳�4");
		thread4.start();
	}
}
