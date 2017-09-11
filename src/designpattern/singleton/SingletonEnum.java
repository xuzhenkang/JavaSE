package designpattern.singleton;

/**
 * 枚举单例模式
 * 优点：枚举本身就是单例模式，效率高、无法利用反射漏洞破解
 * 缺点：无延迟加载
 * @author lenovo
 *
 */
public enum SingletonEnum {
	INSTANCE;
	public void singletonOperation() {
		// 自己的操作
	}
}
