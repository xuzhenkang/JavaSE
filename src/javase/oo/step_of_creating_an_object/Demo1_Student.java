package javase.oo.step_of_creating_an_object;

class Demo1_Student {
	public static void main(String[] args) {
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "����";
	private int age = 23;

	public Student() {
		name = "����";
		age = 24;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
/*
 *
 * 	* 1,Student.class���ؽ��ڴ�
	* 2,����һ��Student��������s
	* 3,�ڶ��ڴ洴������,
	* 4,������������Ĭ�ϳ�ʼ��ֵ
	* 5,���Խ�����ʾ��ʼ��
	* 6,���췽����ջ,�Զ����е����Ը�ֵ,���췽����ջ
	* 7,������ĵ�ֵַ��ֵ��s
 */
