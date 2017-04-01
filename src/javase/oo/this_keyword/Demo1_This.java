package javase.oo.this_keyword;

/*
* A:this�ؼ����ص�
	* ����ǰ��������� 
* B:������ʾ
	* this��Ӧ�ó���
	* �������ֳ�Ա�����;ֲ���������
*/
class Demo1_This {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("����");
		p1.setAge(23);
		System.out.println(p1.getName() + "..." + p1.getAge());

		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(24);
		System.out.println(p2.getName() + "..." + p2.getAge());
	}
}

class Person {
	private String name;			//����
	private int age;				//����
	
	public void setAge(int age) {		//��������
		if (age > 0 && age < 200) {
			this.age = age;
			//System.out.println(age);
		}else {
			System.out.println("��ػ��ǰ�,�����ʺ���");
		}
		
	}

	public int getAge() {			//��ȡ����
		return age;
	}

	public void setName(String name) {	//��������
		this.name = name;
		//System.out.println(name);
	}

	public String getName() {
		return name;
	}
}