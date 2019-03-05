package javase.generic;

import java.util.ArrayList;
import java.util.List;

//*super: super后面是泛型的下限，也就是说，传入的类型一定要是给定的类的直接或间接父类（含给定类）
public class Demo06_Super {

	public static void main(String[] args) {
		List<Apple> list1 = new ArrayList<Apple>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Object> list3 = new ArrayList<Object>();
		test(list3);
		
		// 规则
		List<? super Apple> list4 = new ArrayList<Apple>();
		test(list4);
		List<? super Fruit> list5 = new ArrayList<Object>();
		test(list5);
		List<? super FujiApple> list6 = new ArrayList<Object>();
//		test(list6);
		List<?> list7 = new ArrayList<Object>();
//		test(list7); ? 相当于 ? extends Object,所以不能放进来
		
		test(new ArrayList<Apple>());
	}
	
	public static void test(List<? super Apple> list) {
		// 不能添加父类对象
		list.add(new Apple());
		list.add(new FujiApple());
//		list.add(new Fruit());
	}

//	// super不能使用在类上，下面会报错
//	static class Test<T super Fruit> {
//	}
}
