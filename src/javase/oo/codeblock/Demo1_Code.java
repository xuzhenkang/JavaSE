package javase.oo.codeblock;

class Demo1_Code {
	public static void main(String[] args) {
		{
			int x = 10;						//�޶���������������
			System.out.println(x);
		}
		
		Student s1 = new Student();
		System.out.println("---------------");
		Student s2 = new Student("����",23);
	
	}

	static {
		System.out.println("���������������еľ�̬�����");
	}
}

class Student {
	private String name;
	private int age;

	public Student(){
		//study();
		System.out.println("�ղι���");
	}					//�ղι���

	public Student(String name,int age) {//�вι���
		//study();
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	{											//��������:ÿ����һ�ζ���ͻ�ִ��һ��,�����ڹ��캯��ִ��
		//System.out.println("��������");
		study();
	}

	public void study() {
		System.out.println("ѧ��ѧϰ");
	}

	static {									//��������ض�����,��ִֻ��һ��
		System.out.println("���Ǿ�̬�����");	//����:����������г�ʼ��,һ��������������
	}											//��̬�������������������ִ��
}