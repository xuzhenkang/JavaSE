package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 通过反射调用其他类中的方法
 * @author kang
 *
 */
public class TestPerson4Methods {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Method method = demo.getMethod("sayChina");
			method.invoke(demo.newInstance());
			method = demo.getMethod("sayHello", String.class, int.class);
			method.invoke(demo.newInstance(), "Rollen", 20);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
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
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
