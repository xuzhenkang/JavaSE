package reflect;

/**
 * Person2类与Person1类不同的地方在于：
 * Person2类没有无参的构造器
 * @author lenovo
 *
 */
public class Person2 {
	private String name;
	private int age;
	/**
	 * 该构造器是与Person1类的区别
	 * @param name
	 * @param age
	 */
	public Person2(String name, int age) {
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
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.age + "]";
	}
}