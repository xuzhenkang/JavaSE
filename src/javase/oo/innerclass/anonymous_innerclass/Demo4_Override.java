package javase.oo.innerclass.anonymous_innerclass;

class Demo4_Override {
	public static void main(String[] args) {
		
	}
}

class Person1 {
	public void print() {
		System.out.println("Person1");
	}
}

class Student extends Person1 {
	public void print() {
		System.out.println("Student");
	}
}

class Father { 
	public Person1 method() {
		return new Person1();
	}
}

class Son extends Father {
	public Student method() {
		return new Student();
	}
}

