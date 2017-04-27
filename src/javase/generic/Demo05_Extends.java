package javase.generic;

import java.util.ArrayList;
import java.util.List;
//* extends ���������� ��Ҳ����˵���������һ��Ҫ�Ǹ��������ֱ�ӻ������ࣨ�������ࣩ
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
//		test(list5); ���� ? �൱�� ? extends Object
		List< ? extends Object> list6 = new ArrayList<Object>();
//		test(list6);
		
		List<FujiApple> app = new ArrayList<FujiApple>();
		test(app);
		
	}
	
	public static void test(List<? extends Fruit> list) {
		list.add(null);// �˴�ֻ�ܼ�null����������������κζ���
//		list.add(new Apple()); �Ƿ�
//		list.add(new FujiApple()); �Ƿ�
//		list.add(new Pear()); �Ƿ�
	}
	
	// extends ����������
	static class Test<T extends Fruit> {
	}
}
