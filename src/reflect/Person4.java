package reflect;

public class Person4 implements China  {

	private String sex;

	public Person4() {
	}

	public Person4(String sex) {
		super();
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void sayChina() {
		System.out.println("Hello, China");
	}

	@Override
	public void sayHello(String name, int age) {
		System.out.println(name + ", " + age);
	}

}
