package javase.generic;

import java.util.ArrayList;
import java.util.List;
/*
 * ? ͨ����� ��ʾ���Ͳ�ȷ�������Է����β�|��������|����ֵ�ϡ�
 * ��������
 * 1����������
 * 2�����������ࡢ���ͷ��������ͽӿڡ�
 */
public class Demo04_Wildcards {
	public static void main(String[] args) {
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
		
//		list = new ArrayList<?>(); �������
	}
	public static void test(List<?> list) {
	}
	public static List<?> test1() {
		return null;
	}
//	public static <?> void test2(List<?> list) { �������ڷ��ͷ�����
//	}
	class Test<T> {
	}
//	class Test2<?> { // ���ܴ���������
//	}
	
}
