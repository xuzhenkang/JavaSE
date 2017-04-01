package javase.oo.innerclass.anonymous_innerclass.test;

class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//��ε���PersonDemo�е�method������?
		PersonDemo pd = new PersonDemo ();
		//pd.method(new Student());
		pd.method(new Person2() {
			public void show() {
				System.out.println("show");
			}
		});
	}
}
//����д�����࣬�ӿڶ���
abstract class Person2 {
	public abstract void show();
}

class PersonDemo {
	
	//public void method(Person p) {		//Person p = new Student();		//��������ָ���������
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