package javase.oo.innerclass.static_innerclass;

class Test1_InnerClass {
	public static void main(String[] args) {
		Outer1.Inner oi = new Outer1().new Inner();
		oi.show();
	}
}
//Ҫ��ʹ����֪�ı������ڿ���̨���30��20��10��
//�ڲ���֮�����ܻ�ȡ���ⲿ��ĳ�Ա,����Ϊ���ܻ�ȡ���ⲿ��������ⲿ����.this
class Outer1 {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer1.this.num);
		}
	}
}
