package javase.oo.inherit;

class Demo4_Extends {
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.print();
	}
}
/*
* A:������ʾ
	* a:��ͬ���ı���
	* b:ͬ���ı���
		�Ӹ������ͬ���ı���ֻ���ڽ����о�������,�ڿ������ǲ���������������
		����̳и������Ϊ��ʹ�ø���ĳ�Ա,��ô���������ͬ���ĳ�Ա����û��������
*/

class Father1 {
	int num1 = 10;
	int num2 = 30;
}

class Son1 extends Father1 {
	int num2 = 20;

	public void print() {
		System.out.println(this.num1);				//this�ȿ��Ե��ñ����,Ҳ���Ե��ø����(����û�е������)
		System.out.println(this.num2);				//�ͽ�ԭ��,�����оͲ��ø������
		System.out.println(super.num2);
	}
}