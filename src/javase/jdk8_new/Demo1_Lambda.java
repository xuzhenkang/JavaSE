package javase.jdk8_new;

public class Demo1_Lambda {
	
	public static void main(String[] args) {
		/*
		 * 例1 用lambda表达式实现Runnable
		 */
		// Java8 之前
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do!");
			}
		}).start();
		// Java8方式
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks!")).start();
	}
	
	
	
}


