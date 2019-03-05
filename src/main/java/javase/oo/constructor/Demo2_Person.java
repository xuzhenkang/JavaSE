package javase.oo.constructor;

class Demo2_Person {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.show();

		System.out.println("---------------------");

		Person1 p2 = new Person1("张三",23);
		p2.show();

		System.out.println("---------------------");

		Person1 p3 = new Person1("李四",24);
		p3.show();
	}
}
/*
* A:案例演示
	* 构造方法的重载
	* 重载:方法名相同,与返回值类型无关(构造方法没有返回值),只看参数列表
* B:构造方法注意事项
	* a:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
	* b:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
		* 注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法
		
*/
class Person1 {
	private String name;			//姓名
	private int age;				//年龄

	public Person1() {				//空参构造
		System.out.println("空参的构造");
	}

	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");
	}
	
	public void show() {
		System.out.println(name + "..." + age);
	}
}