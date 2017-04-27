package javase.collections.map;

import java.util.WeakHashMap;

// WeakHashMap�ļ�Ϊ�����ͣ�gc���л��������գ������μ�jvm.gc.RefDemo
// ������HashMap��û�취�ﵽ��һ�㡣
public class Demo9_WeakHashMap {
	public static void main(String[] args) {
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		// �������
		// �������� ���ᱻ����
		map.put("abc", "a");
		map.put("d", "test");
		
		// gc�����������ö���
		map.put(new String("kang"), "c");
		map.put(new String("dsf"), "d");
		
		// ֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
