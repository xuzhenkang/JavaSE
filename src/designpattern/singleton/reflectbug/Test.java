package designpattern.singleton.reflectbug;

import java.lang.reflect.Constructor;

/**
 * ���÷���©���ƽⵥ��ģʽ��designpattern.singleton���µ����ֵ���ģʽ��ֻ�����ø÷�ʽ�ƽ��������֣��޷��ƽ�ö�ٵ���ģʽ��
 * �����ʾ���Զ���ʽ����ģʽ�����ƽ⣬�����ľ����ơ�
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
