package javase.oo.class_definition_and_usage;

class Demo2_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
/*
* A:�����е�λ�ò�ͬ
	* ��Ա�����������з�����
	* �ֲ��������ڷ��������л��߷���������
* B:���ڴ��е�λ�ò�ͬ
	* ��Ա�������ڶ��ڴ�(��Ա�������ڶ���,��������ڴ�)
	* �ֲ���������ջ�ڴ�(�ֲ��������ڷ���,������ջ�ڴ�)
* C:�������ڲ�ͬ
	* ��Ա���������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
	* �ֲ����������ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
* D:��ʼ��ֵ��ͬ
	* ��Ա��������Ĭ�ϳ�ʼ��ֵ
	* �ֲ�������û��Ĭ�ϳ�ʼ��ֵ�����붨�壬��ֵ��Ȼ�����ʹ�á�
	
* ע�����
	* �ֲ��������ƿ��Ժͳ�Ա��������һ�����ڷ�����ʹ�õ�ʱ�򣬲��õ��Ǿͽ�ԭ��
	* �����������ͱ���������Щ:byte,short,int,long,float,double,boolean,char
	* �����������ͱ���������Щ:����,��,�ӿ�,ö��
*/
class Person {
	String name;						//��Ա����
	int num;

	public void speak() {
		int num = 10;						//x��num���Ǿֲ�����
		System.out.println(name);
	
		System.out.println(num);
	}
}
