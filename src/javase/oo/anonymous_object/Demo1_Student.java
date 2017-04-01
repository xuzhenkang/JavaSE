package javase.oo.anonymous_object;

class Demo1_Student {
	public static void main(String[] args) {
		print(10);

		Student s = new Student();					//��������,��������ĵ�ֵַ��ֵ��s
		print(s);
	}

	public static void print(int x) {				//�����������͵�����ʽ����
		System.out.println(x);
	}

	public static void print(Student stu) {			//�����������͵�����ʽ����
		stu.name = "����";
		stu.age = 23;
		stu.speak();
	}
}

/*
* A:�����Ĳ���������public void print(Student s){}//print(new Student());
	* ����㿴����һ����������ʽ������һ��������(��������)��������ʵ��Ҫ���Ǹ���Ķ���
*/
class Student {
	String name;					//����
	int age;						//����

	public void speak() {
		System.out.println(name + "..." + age);
	}
}