package javase.oo.abstractclass.test;

public class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("�ӷ�", 8);
		System.out.println(c.getName() + "..." + c.getAge());
		
		c.eat();
		c.catchMouse();
		Dog d = new Dog("�˹�", 30);
		System.out.println(d.getName() + "..." + d.getAge());
		d.eat();
		d.lookHome();
	}
	
}
abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public abstract void eat();
}
class Cat extends Animal {
	public Cat() {}

	public Cat(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat() {
		System.out.println("è����");
	}
	public void catchMouse() {
		System.out.println("ץ����");
	}
}
class Dog extends Animal {
	public Dog() {}

	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat() {
		System.out.println("è����");
	}
	public void lookHome() {
		System.out.println("����");
	}
}
/*
- A:������ʾ

    - �������è����

    - ���ԣ����������䣬�Է�

    - è�����ԣ�ץ����

    - �������ԣ�����
*/