package practice;

public class TestTheadGroup {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		ThreadGroup threadGroup = new ThreadGroup("thread group1");
		Thread t1 = new Thread(threadGroup, mr, "thread1");
		Thread t2 = new Thread(threadGroup, mr, "thread2");
		System.out.println(t1.getName() + " " + t1.getThreadGroup().getName());
		System.out.println(t2.getName() + " " + t2.getThreadGroup().getName());
	}
}
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "...");
	}
	
}