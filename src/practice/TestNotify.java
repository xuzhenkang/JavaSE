package practice;

public class TestNotify {
	public static void main(String[] args) {
		final Printer1 printer = new Printer1();
		new Thread() {
			@Override
			public void run() {
				while (true)
					try {
						printer.print1();
					} catch (InterruptedException e) {
					}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while (true)
					try {
						printer.print2();
					} catch (InterruptedException e) {
					}
			}
		}.start();
	}
}

class Printer1 {
	private int flag = 1;
	public synchronized void print1() throws InterruptedException {
		if (flag != 1) this.wait();
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.println("员");
		flag = 2;
		this.notify();
	}

	public synchronized void print2() throws InterruptedException {
		if (flag != 2) this.wait();
		System.out.print("传");
		System.out.print("智");
		System.out.print("播");
		System.out.println("客");
		flag = 1;
		this.notify();
	}
}
