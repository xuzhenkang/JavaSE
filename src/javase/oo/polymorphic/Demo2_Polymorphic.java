package javase.oo.polymorphic;

public class Demo2_Polymorphic {
	public static void main(String[] args) {
/*		Father f = new Son();			// ��������ָ���������
		System.out.println(f.num);
		Son s = new Son();
		System.out.println(s.num);*/
		
		Father f = new Son();
		///f.print();
		f.method();						// �뵱��Father.method()
	}
}

/*
��Ա����
�����߿���ߣ����ࣩ�������߿���ߣ����ࣩ
��Ա����
�����߿���ߣ����ࣩ�������߿��ұߣ����ࣩ. ��̬��
��̬����
 ���뿴��ߣ����п��ұ�
(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
*/

class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	public static void method() {
		System.out.println("father static method");
	}
}

class Son extends Father {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("son static method");
	}
}