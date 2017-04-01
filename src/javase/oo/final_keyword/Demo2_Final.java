package javase.oo.final_keyword;

class Demo2_Final {
	public static void main(String[] args) {
		final int num = 10;
		//num = 20;
		System.out.println(num);

		final Person p = new Person("����",23);
		//p = new Person("����",24);
		p.setName("����");
		p.setAge(24);

		System.out.println(p.getName() + "..." + p.getAge());

		method(10);
		method(20);
	}

	public static void method(final int x) {
		System.out.println(x);
	}
}
/*
* A:������ʾ
	* �����ڲ����߷��������϶���ʾһ��(�˽�)

	* �������ͣ���ֵ���ܱ��ı�
	* �������ͣ��ǵ�ֵַ���ܱ��ı�,�����е����Կ��Ըı�
*/

class Person {
	private String name;			//����
	private int age;				//����

	public Person(){}				//�ղι���

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {	//��������
		this.name = name;
	}

	public String getName() {		//��ȡ����
		return name;
	}

	public void setAge(int age) {	//��������
		this.age = age;
	}

	public int getAge() {			//��ȡ����
		return age;
	}
}