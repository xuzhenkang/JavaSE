package javase.jdk8_new;

public class Demo1_Lambda {
	
	public static void main(String[] args) {
		/*
		 * ��1 ��lambda���ʽʵ��Runnable
		 */
		// Java8 ֮ǰ
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do!");
			}
		}).start();
		// Java8��ʽ
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks!")).start();
	}
	
	
	
}


