package designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种单例模式的效率情况
 * 
 * 测试结果：
 * 速度（由快到慢）：枚举单例模式>饿汉式单例模式>静态内部类单例模式>双重检测锁单例模式>懒汉式单例模式
 * 
 * 使用原则：
 * 单例对象占用资源少，不需要延迟加载， 枚举式由于饿汉式
 * 单例对象占用资源大，需要延迟加载，静态内部类式由于懒汉式
 * 双重检测锁式 由于JVM底层内部模型的原因，偶尔会出现问题，不建议使用。
 * 
 * @author Kang
 *
 */
public class EfficiencyTest {

	public static void main(String[] args) {
		
		int threadNum = 10;
		long begin = System.currentTimeMillis();
		
		CountDownLatch cdl = new CountDownLatch(threadNum);
		
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				@Override
				public void run() {
					for (int i = 0; i < 10000000; i++) {
//						Object o = SingletonHungry.getInstance(); //运行结果： 41
//						Object o = SingletonLazy.getInstance(); // 运行结果：23389
//						Object o = SingletonDCL.getInstance(); // 运行结果：175
//						Object o = SingletonSIC.getInstance(); // 运行结果：54
						SingletonEnum e = SingletonEnum.INSTANCE; // 运行结果：34
					}
					cdl.countDown();
				}
			}.start();
		}
		try {
			cdl.await();
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
