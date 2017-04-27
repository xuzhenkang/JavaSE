package javase.generic;

import java.util.ArrayList;
import java.util.List;
/*
 * ? 通配符， 表示类型不确定，可以放在形参|声明变量|返回值上。
 * 不能用在
 * 1、创建对象
 * 2、创建泛型类、泛型方法、泛型接口、
 */
public class Demo04_Wildcards {
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
		
//		list = new ArrayList<?>(); 编译错误，
	}
	public static void test(List<?> list) {
	}
	public static List<?> test1() {
		return null;
	}
//	public static <?> void test2(List<?> list) { 不能用在泛型方法上
//	}
	class Test<T> {
	}
//	class Test2<?> { // 不能创建泛型类
//	}
	
}
