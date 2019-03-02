package javase.generic;

import java.util.ArrayList;
import java.util.List;
//* extends 后面是上限 ，也就是说传入的类型一定要是给定的类的直接或间接子类（含给定类）
public class Demo05_Extends {
	public static void main(String[] args) {
		Test<Fruit> t1 = new Test<Fruit>();
		Test<Apple> t2 = new Test<Apple>();
		Test<Pear> t3 = new Test<Pear>();
		
		List<? extends Fruit> list1 = new ArrayList<Fruit>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);
		
		// ? extends Apple
		List<FujiApple> list4 = new ArrayList<FujiApple>();
		test(list4);
		List<?> list5 = new ArrayList<Fruit>();
//		test(list5); 错误 ? 相当于 ? extends Object
		List< ? extends Object> list6 = new ArrayList<Object>();
//		test(list6);
		
		List<FujiApple> app = new ArrayList<FujiApple>();
		test(app);
		
	}
	
	public static void test(List<? extends Fruit> list) {
		list.add(null);// 此处只能加null，不能添加其他的任何对象
//		list.add(new Apple()); 非法
//		list.add(new FujiApple()); 非法
//		list.add(new Pear()); 非法
	}
	
	// extends 后面是上限
	static class Test<T extends Fruit> {
	}
}
