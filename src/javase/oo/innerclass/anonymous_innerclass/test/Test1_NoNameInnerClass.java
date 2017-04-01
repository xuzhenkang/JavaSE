package javase.oo.innerclass.anonymous_innerclass.test;

class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method方法呢?
		PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person2() {
			public void show() {
				System.out.println("show");
			}
		});
	}
}
//这里写抽象类，接口都行
abstract class Person2 {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//父类引用指向子类对象
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
	public void method(Person2 p) {
		p.show();
	}
}

class Student1 extends Person2 {
	public void show() {
		System.out.println("show");
	}
}