package javase.oo.codeblock;

class Student1 {
	static {
		System.out.println("Student ��̬�����");
	}
	
	{
		System.out.println("Student ��������");
	}
	
	public Student1() {
		System.out.println("Student ���췽��");
	}
}

class Demo2_Student {
	static {
		System.out.println("Demo2_Student��̬�����");
	}
	
	public static void main(String[] args) {
		System.out.println("����main����");
		
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
	}
}