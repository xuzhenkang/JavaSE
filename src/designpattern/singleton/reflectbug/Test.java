package designpattern.singleton.reflectbug;

import java.lang.reflect.Constructor;

/**
 * 利用反射漏洞破解单例模式（designpattern.singleton包下的五种单例模式，只能利用该方式破解其中四种，无法破解枚举单例模式）
 * 这里仅示范对饿汉式单例模式进行破解，其他的均类似。
 * 
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		Class<?> clazz = Class.forName("designpattern.singleton.reflectbug.Singleton");
		Constructor<?> constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Singleton s3 = (Singleton) constructor.newInstance();

		System.out.println(s1 + "\n" + s2 + "\n" + s3);

	}
}
