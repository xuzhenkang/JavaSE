package reflect;

/**
 * Person2����Person1�಻ͬ�ĵط����ڣ�
 * Person2��û���޲εĹ�����
 * @author lenovo
 *
 */
public class Person2 {
	private String name;
	private int age;
	/**
	 * �ù���������Person1�������
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