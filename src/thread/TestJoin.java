package thread;


public class TestJoin {
	public static void main(String[] args) {
		final Thread t0 = new Thread("线程0") {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("线程0，i=" + i);
				}
			};
		};
		Thread t1 = new Thread("线程1") {
			public void run() {
				for (int i = 0; i < 20; i++) {
					if (i == 3) {
						try {
							t0.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("线程1，i=" + i);
				}
			};
		};
		
		t0.start();
		t1.start();
	}
}
