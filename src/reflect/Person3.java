package reflect;

public class Person3 {
	private String name;
	private int age;
	/**
	 * �޲ι�����
	 */
	public Person3() {}
	
	/**
	 * �вι�����
	 * @param name
	 */
	public Person3(String name) {
		this.name = name;
	}
	/**
	 * �вι�����
	 * @param age
	 */
	public Person3(int age) {
		this.age = age;
	}

	/**
	 * �вι�����
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
