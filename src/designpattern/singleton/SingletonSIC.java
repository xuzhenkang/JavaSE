package designpattern.singleton;

/**
 * 静态内部类单例模式（SIC， Static Inner Class Singleton）
 * 优点：线程安全、调用效率高、可以延迟加载
 * 缺点：没啥缺点！
 * @author lenovo
 *
 */
public class SingletonSIC {
	private static class Inner {
		/*final 可用可不用*/
		private static /*final*/ SingletonSIC instance = new SingletonSIC();
	}
	private SingletonSIC(){}
	
	public static SingletonSIC getInstance() {
		return Inner.instance;
	}
}
