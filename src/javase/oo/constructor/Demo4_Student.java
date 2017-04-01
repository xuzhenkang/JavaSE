package javase.oo.constructor;

class Demo4_Student {
	public static void main(String[] args) {
		Student s1 = new Student();					//ʹ�ÿղι���
		s1.setName("����");							//��������
		s1.setAge(23);								//��������

		System.out.println("�ҵ�������:" + s1.getName() + ",�ҵ�������:" + s1.getAge());
		//getXxx()��ȡ����ֵ,���Դ�ӡ,Ҳ���Ը�ֵ�������ı���,�������Ĳ���
		Student s2 = new Student("����",24);
		s2.show();									//ֻ��Ϊ����ʾ����ֵ
	}
}
/*
* A:������ʾ
	* ѧ���ࣺ
		* ��Ա������
			* name��age
		* ���췽����
			* �޲Σ���������
		* ��Ա������
			* getXxx()/setXxx()
			* show()�������������г�Ա����ֵ
* B:����Ա������ֵ��
	* a:setXxx()����
	* b:���췽��
	
* C:�����Ա����ֵ�ķ�ʽ��
	* a:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
	* b:ͨ������show()�����㶨
*/

class Student {
	private String name;							//����
	private int age;								//����

	public Student(){}								//�ղι���

	public Student(String name,int age) {			//�вι���
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {				//��������
		this.name = name;
	}

	public String getName() {						//��ȡ����
		return name;
	}

	public void setAge(int age) {					//��������
		this.age = age;
	}

	public int getAge() {							//��ȡ����
		return age;
	}

	public void show() {
		System.out.println("�ҵ�������:" + name +  ",�ҵ�������:" +  age);
	}
}