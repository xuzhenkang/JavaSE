package javase.oo.innerclass.anonymous_innerclass;

class Demo3_Con {
	public static void main(String[] args) {
		Person p = new Person();
		//p.Person();
	}
}

class Person {
	//public void Person() {						//���ǹ��췽��,��һ����ͨ����
	public Person() {
		System.out.println("Hello World!");
	}
}