package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * 通过Class调用其他类中的构造函数 （也可以通过这种方式通过Class创建其他类的对象）
 * @author lenovo
 *
 */
public class TestPerson3 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person3");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person3 per1 = null;
		Person3 per2 = null;
		Person3 per3 = null;
		Person3 per4 = null;
		
		// 取得全部的构造器
		Constructor<?>[] cons = demo.getConstructors();// 注意这个方法产生的构造器数组顺序可能有点问题。
		
		/***
		 * 尽量使用这个方法：
		    Constructor cons0 = demo.getConstructor();
            Constructor cons1 = demo.getConstructor(String.class);
            Constructor cons2 = demo.getConstructor(int.class);
            Constructor cons3 = demo.getConstructor(String.class,int.class);
		 */
		
		try {
			/**
			 * 这里遇到了一个问题，下标与对应的构造器的顺序是否一致，经过试验得出结论，不一致。
			 * 为啥呢？网上有个帖子给出这样的答案：
			 * javac按Java源码声明的顺序把构造器声明逐个写到Class文件里，然后JVM也按顺序把这些声明加载进来，
			 * 最后反射在getConstructors() / getMethods()也按照这个顺序把结果返回出来。
			 * 
			 * 也有人说是jdk版本的问题。“返回的构造器数组是不依赖于声明顺序的，这是jdk本身决定的，他就没有保证顺序”
			 * 总之，这个顺序不是要关注的重点
			 */
			per1 = (Person3) cons[0].newInstance("Rollen", 20);
			per2 = (Person3) cons[1].newInstance(20);
			per3 = (Person3) cons[2].newInstance();
			per4 = (Person3) cons[3].newInstance("Rollen");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}
}


