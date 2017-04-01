package javase.oo.constructor;

class Demo1_Constructor {						//Constructor����
	public static void main(String[] args) {
		Person p = new Person();				//��һ���������ʱ��,ϵͳ�Ͱ��ҵ����˹��췽��
		//p.Person();							//���췽�������ö������
		p.show();

		Person p2 = new Person();				//�ٴδ�������
	
		p2.show();
	}
}

/*
* A:���췽������������
	* �����������(����)���г�ʼ��
* B:���췽����ʽ�ص�
	* a:��������������ͬ(��СҲҪ������һ��)
	* b:û�з���ֵ���ͣ���void��û��
	* c:û�о���ķ���ֵreturn;
*/

class Person {
	private String name;
	private int age;

	//���췽��
	public Person() {
		//System.out.println("Hello World!");
		//return;								//���췽��Ҳ����return����,��ʽ��return;
		name = "����";
		age = 23;
	}

	public void show() {
		System.out.println(name + "..." + age);
	}
}
