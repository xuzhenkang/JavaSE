package demotest.t01;

public class B {
	public static B t1 = new B();
	public static B t2 = new B();
	{
		System.out.println("�����");
	}
	static {
		System.out.println("��̬��");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B t = new B();
	}
}
