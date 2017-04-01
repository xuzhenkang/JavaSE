package javase.oo.abstractclass.test;

/**
 * - A:案例演示
 * 
 * - 具体事物：基础班老师，就业班老师
 * 
 * - 共性：姓名，年龄，讲课。
 * 
 * - 具体事物：基础班学生，就业班学生
 * 
 * - 共性：姓名，年龄，学习
 * 
 * @author Dan
 *
 */
public class Test2_Teacher {
	public static void main(String[] args) {
		BaseTeacher baseTeacher = new BaseTeacher("冯佳", 18);
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
		System.out.println("我的名字是：" + this.getName() + "我的年龄是：" + this.getAge());
	}
	
}
