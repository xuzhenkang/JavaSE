package javase.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 注意：泛型没有多态，也没有泛型数组的概念
 * @author lenovo
 *
 */
public class Demo08_Notices {
	public static void main(String[] args) {
		Fruit f = new Apple();// 多态
//		List<Fruit> list = new ArrayList<Apple>();// 报错， 泛型没有多态
		List<? extends Fruit> list = new ArrayList<Apple>();
		
		// 泛型没有数组
		Fruit[] arr = new Fruit[10];
//		Fruit<String>[] arr2 = new Fruit<String>[10];// 报错，没有泛型数组的概念
		
		// JDK1.7针对泛型的简化
		List<Fruit> list2 = new ArrayList<>();
		
	}
}
