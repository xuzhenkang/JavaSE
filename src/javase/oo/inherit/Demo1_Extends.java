package javase.oo.inherit;

import javase.oo.inherit.Animal;
import javase.oo.inherit.Cat;

class Demo1_Extends {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.color = "��";
		c.leg = 4;
		c.eat();
		c.sleep();

		System.out.println(c.leg  + "..." + c.color);
	}
}
/*
* A:�̳�(extends)
	* ��������֮�������ϵ,�Ӹ����ϵ 
* B:�̳а�����ʾ��
	* ������,è��,����
	* ������������(��ɫ,�ȵĸ���)��������(�Է���˯��)
* C:������ʾ
	* ʹ�ü̳�ǰ
* D:������ʾ
	* ʹ�ü̳к�
*/
class Animal {
	String color;					//�������ɫ
	int leg;						//�����ȵĸ���

	public void eat() {				//�Է��Ĺ���
		System.out.println("�Է�");
	}

	public void sleep() {			//˯���Ĺ���
		System.out.println("˯��");
	}
}

class Cat extends Animal {
	
}

class Dog extends Animal {
	
}

/*
extends�Ǽ̳е���˼
Animal�Ǹ���
Cat��Dog��������
*/