package javase.oo.inherit;

class Demo3_Extends {
	public static void main(String[] args) {
		Son s = new Son();
		//s.show();
	}
}
/*
* A:�̳е�ע������
	* a:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
	* b:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super(���Ͻ�)�ؼ���ȥ���ʸ��๹�췽����
	* c:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
	* ��Ŀ���� ���� ���� ���� ����
	* ����Ա	���� ���� ����
*/

class Father {
	private String name;
	private void show() {
		System.out.println("Hello World!");
	}
}

class Son extends Father {
}