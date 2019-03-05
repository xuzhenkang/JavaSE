package designpattern.singleton;

/**
 * 饿汉式单例模式
 * 优点：线程安全（天然的）、调用效率高（无同步代码块）、
 * 缺点：不能延迟加载
 * @author lenovo
 *
 */
public class SingletonHungry {
	private static SingletonHungry instance = new SingletonHungry();
	private SingletonHungry() {
	}
	public static SingletonHungry getInstance() {
		return instance;
	}
}
