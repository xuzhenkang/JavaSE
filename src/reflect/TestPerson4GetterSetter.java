package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 调用其他类的set和get方法
 * @author kang
 *
 */
public class TestPerson4GetterSetter {
	public static void main(String[] args) {
		Class<?> demo = null;
		Object obj = null;
		try {
			demo = Class.forName("reflect.Person4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			obj = demo.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setter(obj, "Sex", "男", String.class);
		String sex = (String) getter(obj, "Sex");
		System.out.println(sex);
	}
	
	public static void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method method = obj.getClass().getMethod("set" + att, type);
			method.invoke(obj, value);
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
		}
	}
	
	public static Object getter(Object obj, String att) {
		Object result = null;
		try {
			Method method = obj.getClass().getMethod("get" + att);
			result = method.invoke(obj);
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
		}
		return result;
	}
	
}
