package javase.oo.inherit.test;
class Test3_Person {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
/*
* ʹ�ü̳�ǰ��ѧ������ʦ����
	* ����:����,����
	* ��Ϊ:�Է�
	* ��ʦ�����еķ���:����
	* ѧ�������еķ���:ѧϰ
*/

class Student {
	private String name;					//����
	private int age;						//����

	public Student() {}						//�ղι���

	public Student(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public void setAge(int age) {			//��������
		this.age = age;
	}

	public int getAge() {					//��ȡ����
		return age;
	}

	public void eat() {						//�Է�
		System.out.println("ѧ���Է�");
	}

	public void study() {					//ѧϰ
		System.out.println("ѧ��ѧϰ");
	}
}

class Teacher {
	private String name;					//����
	private int age;						//����

	public Teacher() {}						//�ղι���

	public Teacher(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {		//��������
		this.name = name;
	}

	public String getName() {				//��ȡ����
		return name;
	}

	public void setAge(int age) {			//��������
		this.age = age;
	}

	public int getAge() {					//��ȡ����
		return age;
	}

	public void eat() {						//�Է�
		System.out.println("��ʦ�Է�");
	}

	public void teach() {					//ѧϰ
		System.out.println("��ʦ����");
	}
}