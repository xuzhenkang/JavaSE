package javase.oo.packages;

/*
* A:������ĸ�ʽ
	* package ����;
	* �༶����.�ֿ�����
* B:�������ע������
	* A:package�������ǳ���ĵ�һ����ִ�еĴ���
	* B:package�����һ��java�ļ���ֻ����һ��
	* C:���û��package��Ĭ�ϱ�ʾ�ް���
*/
//import java.util.Scanner;		//�ڿ����������õĶ��ǵ���������
import java.util.*;				//*����ͨ���,���ᵽ�ð��°���ƥ��,ƥ���Ͼ͵���
class Demo1_Package {
	public static void main(String[] args) {
		Person p = new Person("����",23);
		System.out.println(p.getName() + "..." + p.getAge());
		//p.print();			//�ڲ�ͬ���µ��޹���,���������,��Ϊ��protected���ε�

		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);*/
		
		Student s = new Student("����",24);
		System.out.println(s.getName() + "..." + s.getAge());
		s.method();
	}
}
