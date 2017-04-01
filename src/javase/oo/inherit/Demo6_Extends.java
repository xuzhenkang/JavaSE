package javase.oo.inherit;

class Demo6_Extends {
	public static void main(String[] args) {
		Son3 s1 = new Son3();
		System.out.println(s1.getName() + "..." + s1.getAge());
		System.out.println("--------------------");
		Son3 s2 = new Son3("����",23);
		System.out.println(s2.getName() + "..." + s2.getAge());
	}
}
/*
* A:������ʾ
	* ����û���޲ι��췽��,������ô��?
	* super���
	* this���
* B:ע������
	* super(��)����this(��.)��������ڹ��췽���ĵ�һ�������
*/
class Father3 {
	private String name;			//����
	private int age;				//����

	public Father3() {				//�ղι���
		System.out.println("Father �ղι���");
	}

	public Father3(String name,int age) {	//�вι���
		this.name = name;
		this.age = age;
		System.out.println("Father �вι���");
	}

	public void setName(String name) {	//��������
		this.name = name;
	}

	public String getName() {			//��ȡ����
		return name;
	}

	public void setAge(int age) {		//��������
		this.age = age;
	}

	public int getAge() {				//��ȡ����
		return age;
	}
}

class Son3 extends Father3 {
	public Son3() {						//�ղι���
		this("����",25);				//�����еĹ��췽��
		//super("����",24);				//���ø����еĹ��췽��
		
		System.out.println("Son �ղι���");
	}

	public Son3(String name,int age) {	//�вι���
		super(name,age);
		System.out.println("Son �вι���");
	}
}