package javase.oo.static_keyword;

class Demo1_Static {
	public static void main(String[] args) {
		/*Person p1 = new Person();	//��������
		p1.name = "����ʦ";			//�����������Բ���ֵ
		p1.country = "�ձ�";		//���ù������Բ���ֵ
		

		Person p2 = new Person();
		p2.name = "С����ʦ";		//�����������Բ���ֵ
		//p2.country = "�ձ�";		//���ù������Բ���ֵ

		p1.speak();
		p2.speak();*/

		Person.country = "�ձ�";	//��̬����һ�ֵ��÷�ʽ,����ͨ������.
		System.out.println(Person.country);
	}
}

class Person {
	String name;					//����
	static String country;					//����

	public void speak() {			//˵���ķ���
		System.out.println(name + "..." + country);
	}
}