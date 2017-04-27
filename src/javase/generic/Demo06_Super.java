package javase.generic;

import java.util.ArrayList;
import java.util.List;

//*super: super�����Ƿ��͵����ޣ�Ҳ����˵�����������һ��Ҫ�Ǹ��������ֱ�ӻ��Ӹ��ࣨ�������ࣩ
public class Demo06_Super {

	public static void main(String[] args) {
		List<Apple> list1 = new ArrayList<Apple>();
		test(list1);
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);
		List<Object> list3 = new ArrayList<Object>();
		test(list3);
		
		// ����
		List<? super Apple> list4 = new ArrayList<Apple>();
		test(list4);
		List<? super Fruit> list5 = new ArrayList<Object>();
		test(list5);
		List<? super FujiApple> list6 = new ArrayList<Object>();
//		test(list6);
		List<?> list7 = new ArrayList<Object>();
//		test(list7); ? �൱�� ? extends Object,���Բ��ܷŽ���
		
		test(new ArrayList<Apple>());
	}
	
	public static void test(List<? super Apple> list) {
		// ������Ӹ������
		list.add(new Apple());
		list.add(new FujiApple());
//		list.add(new Fruit());
	}

//	// super����ʹ�������ϣ�����ᱨ��
//	static class Test<T super Fruit> {
//	}
}
