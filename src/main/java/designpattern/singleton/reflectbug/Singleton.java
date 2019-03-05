package designpattern.singleton.reflectbug;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
		/*为了防止通过反射破解单例模式，在此处加如下代码*/
		if (instance != null)
			throw new RuntimeException();
	}

	public static Singleton getInstance() {
		return instance;
	}
}
