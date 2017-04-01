package javase.oo.interfaces.test;

public class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("�ӷ�", 8);
		c.eat();
		c.sleep();
		JumCat jc = new JumCat("����è", 3);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}
interface Jumping {
	public abstract void jump();
}
abstract class Animal {
	private String name;
	private int age;
	public Animal() {
	}
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
	public abstract void sleep();
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

	@Override
	public void sleep() {
		System.out.println("����˯");
	}
	
}

class JumCat extends Cat implements Jumping {

	@Override
	public void jump() {
		System.out.println("è����");
	}
	public JumCat(String name, int age) {
		super(name, age);
	}
}
/** 
A:������ʾ
	�����ࣺ���������䣬�Է���˯����
	è�͹�
	����ӿڣ�����
*/
