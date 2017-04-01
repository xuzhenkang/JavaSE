package javase.oo.polymorphic;

public class Demo1_Polymorphic {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		
		Animal a = new Cat();				//��������ָ���������
		a.eat();
	}
}
/*
- A:��̬(polymorphic)����

- ������ڵĶ�����̬
- B:��̬ǰ��
- a:Ҫ�м̳й�ϵ��
- b:Ҫ�з�����д��
- c:Ҫ�и�������ָ���������
- C:������ʾ

- �������ֶ�̬
*/

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}