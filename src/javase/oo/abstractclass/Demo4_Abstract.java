package javase.oo.abstractclass;

public class Demo4_Abstract {
	public static void main(String[] args) {
		
	}
}
abstract class Demo1 {
	/*���󣺷Ƿ������η���ϣ�The abstract method print in type Demo1 can only set a visibility modifier, one of  public or protected*/
	//public static abstract void print();
	/*The abstract method print in type Demo1 can only set a visibility modifier, one of 
 public or protected */
	//public final abstract void print();
	//private abstract void print();
}
/*
- A:������1

    - һ�����������û�г��󷽷����ɲ����Զ���Ϊ�����ࣿ������ԣ���ʲô���壿

    - ����

    - ��ô��Ŀ��ֻ��һ�������ǲ��������ഴ��������󣬽����������
- B:������2
    - abstract���ܺ���Щ�ؼ��ֹ���
    abstract �� static
    - ��abstract���εķ���û�з�����
    - ��static���εĿ���������.����������������.���������ó��󷽷�����û������ġ�
    abstract��final 
    - ��abstract���εķ���ǿ��������д
    - ��final���εĲ���������д����������ì��
    abstract �� private
    - ��abstract���εķ�����Ϊ�������࿴����ǿ����д
    - ��private ���β���������ʣ�����������ì�ܵ�
*/