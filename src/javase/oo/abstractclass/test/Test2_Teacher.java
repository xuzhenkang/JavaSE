package javase.oo.abstractclass.test;

/**
 * - A:������ʾ
 * 
 * - ���������������ʦ����ҵ����ʦ
 * 
 * - ���ԣ����������䣬���Ρ�
 * 
 * - �������������ѧ������ҵ��ѧ��
 * 
 * - ���ԣ����������䣬ѧϰ
 * 
 * @author Dan
 *
 */
public class Test2_Teacher {
	public static void main(String[] args) {
		BaseTeacher baseTeacher = new BaseTeacher("���", 18);
		baseTeacher.teach();
	}
}

abstract class Teacher {
	private String name;
	private int age;
	
	public Teacher() {}

	public Teacher(String name, int age) {
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
	public abstract void teach();
}

class BaseTeacher extends Teacher {
	public BaseTeacher() {}

	public BaseTeacher(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void teach() {
		System.out.println("�ҵ������ǣ�" + this.getName() + "�ҵ������ǣ�" + this.getAge());
	}
	
}
