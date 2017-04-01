package javase.oo.innerclass.member_innerclass;

class Demo1_InnerClass {
	public static void main(String[] args) {
		//Inner i = new Inner();
		//i.method();
		//�ⲿ����.�ڲ����� = �ⲿ�����.�ڲ������
		Outer.Inner oi = new Outer().new Inner();			//�����ڲ������
		oi.method();

	}
}

/*
* A:�ڲ������
* B:�ڲ�������ص�
	* a:�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
	* b:�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
	* �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
* C:������ʾ
	* �ڲ��༫������ص�
*/

class Outer {
	private int num = 10;
	class Inner {
		public void method() {
			System.out.println(num);
		}
	}
}
