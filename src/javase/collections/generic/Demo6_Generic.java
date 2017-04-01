package javase.collections.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo6_Generic {

	/**
	 * ���͹̶��±߽�
	 * ? super E  
	 * 
	 * ���͹̶��ϱ߽�
	 * ? extends E
	 */
	public static void main(String[] args) {
		//demo1();
		TreeSet<Student1> ts1 = new TreeSet<>(new CompareByAge());
		ts1.add(new Student1("����", 33));
		ts1.add(new Student1("����", 13));
		ts1.add(new Student1("����", 23));
		ts1.add(new Student1("����", 43));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());
		ts2.add(new BaseStudent("����", 33));
		ts2.add(new BaseStudent("����", 13));
		ts2.add(new BaseStudent("����", 23));
		ts2.add(new BaseStudent("����", 43));
		
		System.out.println(ts2);
	}

	public static void demo1() {
		ArrayList<Student1> list1 = new ArrayList<>();
		list1.add(new Student1("����", 23));
		list1.add(new Student1("����", 24));
		
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("����", 25));
		list2.add(new BaseStudent("����", 26));
		
		list1.addAll(list2);
	}

}

class CompareByAge implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		int num = s1.getAge() - s2.getAge();
		return num == 0 ? s1.getName().compareTo(s2.getName()) :  num;
	}
	
}
