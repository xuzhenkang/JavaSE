package javase.oo.polymorphic;
/*
 * - A:��̬�ĺô�
    - a:����˴����ά����(�̳б�֤)
    - b:����˴������չ��(�ж�̬��֤)
- B:������ʾ

    - ��̬�ĺô�

    - ���Ե�����ʽ���������Խ��������������
- C:��̬�ı׶�

    - ����ʹ��������������Ժ���Ϊ��
- D:������ʾ method(Animal a) method(Cat c)
 */
public class Demo4_Animal {
	public static void main(String[] args) {
/*		Cat1 c1 = new Cat1();
		c1.eat();*/
		method(new Cat1());
		// Cat1 c = new Dog();//����
		method(new Dog());
	}
	// �������Ǻ����ڴ��������ʱ���ø�������ָ���������ֱ�Ӵ��������������㣬����ʹ�������е��������Ժ���Ϊ
/*	public static void method(Cat1 c) {
		c.eat();
	}
	public static void method(Dog d) {
		d.eat();
	}*/
	// ����������ʱ���ö�̬��ã���Ϊ��չ��ǿ
	public static void method(Animal1 a) {
		
		// ����ѹ�ǿת��è�ͻ��������ת���쳣��ClassCastException
		// �ؼ���instanceof �ж�ǰ�ߵ������Ƿ��Ǻ�ߵ���������
		if (a instanceof Cat1) {
			Cat1 c = (Cat1) a;
			c.eat();
			c.catchMouse();
		} else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.eat();
			d.lookHome();
		} else {
			a.eat();
		}
	}
}

class Animal1 {
	public void eat() {
		System.out.println("����Է�");
	}
}
class Cat1 extends Animal1 {
	public void eat() {
		System.out.println("è����");
	}
	public void catchMouse() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal1 {
	public void eat() {
		System.out.println("������");
	}
	public void lookHome() {
		System.out.println("����");
	}
}