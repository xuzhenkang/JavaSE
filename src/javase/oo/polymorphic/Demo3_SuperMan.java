package javase.oo.polymorphic;

public class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();			// ��������ָ���������
											// ��������ת��
		System.out.println(p.name);
		p.̸����();
		SuperMan sm = (SuperMan) p;			//����ת��
		//p.fly();
		
		/*
		 * �������������Զ�������ǿ������ת��
		 */
		int i = 10;
		byte b = 20;
		// i = b;			//�Զ���������
		b = (byte) i;	 	// ǿ������ת��
	}
}
class Person {
	String name = "John";
	public void ̸����() {
		System.out.println("̸����");
	}
}

class SuperMan extends Person {
	String name = "superMan";
	public void ̸����() {
		System.out.println("̸�����ڵĴ���");
	}
	public void fly() {
		System.out.println("�ɳ�ȥ����");
	}
}