package designpattern.singleton;

/**
 * 懒汉式单例模式
 * 优点：线程安全（有同步代码块）、可以延迟加载
 * 缺点：调用效率低（有同步代码块）
 * @author lenovo
 *
 */
public class SingletonLazy {
	private static SingletonLazy instance = null;
	
	private SingletonLazy(){}
	
	public static synchronized SingletonLazy getInstance() {
		if (null == instance) {
			instance = new SingletonLazy();
		} 
		return instance;
	}
}
