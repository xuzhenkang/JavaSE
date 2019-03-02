package reflect;

public class Person3 {
	private String name;
	private int age;
	/**
	 * 无参构造器
	 */
	public Person3() {}
	
	/**
	 * 有参构造器
	 * @param name
	 */
	public Person3(String name) {
		this.name = name;
	}
	/**
	 * 有参构造器
	 * @param age
	 */
	public Person3(int age) {
		this.age = age;
	}

	/**
	 * 有参构造器
	 * @param name
	 * @param age
	 */
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[" + this.name + ", " + this.age + "]";
	}
}
