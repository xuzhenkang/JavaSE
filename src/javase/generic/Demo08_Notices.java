package javase.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * ע�⣺����û�ж�̬��Ҳû�з�������ĸ���
 * @author lenovo
 *
 */
public class Demo08_Notices {
	public static void main(String[] args) {
		Fruit f = new Apple();// ��̬
//		List<Fruit> list = new ArrayList<Apple>();// ���� ����û�ж�̬
		List<? extends Fruit> list = new ArrayList<Apple>();
		
		// ����û������
		Fruit[] arr = new Fruit[10];
//		Fruit<String>[] arr2 = new Fruit<String>[10];// ����û�з�������ĸ���
		
		// JDK1.7��Է��͵ļ�
		List<Fruit> list2 = new ArrayList<>();
		
	}
}
