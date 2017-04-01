package javase.oo.innerclass.local_innerclass;

class Demo1_InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
//�ֲ��ڲ���
class Outer {
	public void method() {
		final int num = 10;
		class Inner {
			public void print() {
				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.print();
	}

	/*public void run() {
		Inner i = new Inner();				//�ֲ��ڲ���,ֻ���������ڵķ����з���
		i.print();
	}*/
}