package reflect;

import java.lang.reflect.Constructor;
/**
 * 获得其他类中的全部构造函数
 * @author kang
 *
 */
public class TestPerson1Constructors {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?>[] cons = demo.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println("构造方法：" + cons[i]);
		}
	}
}
