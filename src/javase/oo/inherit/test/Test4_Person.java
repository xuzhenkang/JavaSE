package javase.oo.inherit.test;
class Test4_Person {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setName("����");
		s1.setAge(23);
		System.out.println(s1.getName() + "..." + s1.getAge());
		s1.eat();
		s1.study();

		System.out.println("------------------");
		Student1 s2 = new Student1("����",24);
		System.out.println(s2.getName() + "..." + s2.getAge());
		s2.eat();
		s2.study();
	}
}
/*
* ʹ�ü̳к��ѧ������ʦ����
*/

class Person {
	private String name;					//����
	private int age;						//����

	public Person() {}						//�ղι���

	public Person(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public void setAge(int age) {			//��������
		this.age = age;
	}

	public int getAge() {					//��ȡ����
		return age;
	}

	public void eat() {						//�Է�
		System.out.println(name  + "�Է�");
	}
}

class Student1 extends Person {
	public Student1() {}						//�ղι���

	public Student1(String name,int age) {
		super(name,age);
	}

	public void study() {
		System.out.println(this.getName() + "ѧϰ");
	}
}

class Teacher1 extends Person {
	public Teacher1() {}						//�ղι���

	public Teacher1(String name,int age) {
		super(name,age);
	}

	public void teach() {
		System.out.println(this.getName() + "����");
	}
}