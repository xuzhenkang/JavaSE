package thread.start;

import java.util.concurrent.FutureTask;

public class MethodTest {
	public static void main(String[] args) {
		// 方法1，继承Thread，重写run方法，使用start()方法启动
		new MethodOne("创建方法1").start();
		
		
		// 方法2，实现Runnable接口，重写run方法，将对象放入Thread对象中去，调用Thread对象的start方法启动线程
		new Thread(new MethodTwo(), "创建方法2").start();
		
		
		// 方法3：实现Callable接口，定义返回值类型，重写call方法；
		// 启动方法为，将实例放入FutureTask实例中去，再将FutureTask实例放入一个Thread对象中去，使用Thread的start方法启动。
		// 好处：具有返回值
		new Thread(new FutureTask<Integer>(new MethodThree()), "创建方法3 ").start();
	}
}
