package javase.oo.inherit;

class Demo7_Extends {
	public static void main(String[] args) {
		Son4 s = new Son4();
		s.print();
		s.method();
	}
}
/*
* a:��ͬ���ķ���
* b:ͬ���ķ���
*/

class Father4 {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son4 extends Father4 {
	public void method() {
		System.out.println("Zi Method");
	}

	public void print() {
		super.print();							//super���Ե��ø���ĳ�Ա����
		System.out.println("Zi print");
	}
}