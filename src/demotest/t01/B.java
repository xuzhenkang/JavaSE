package demotest.t01;

public class B {
	public static B t1 = new B();
	public static B t2 = new B();
	{
		System.out.println("¹¹Ôì¿é");
	}
	static {
		System.out.println("¾²Ì¬¿é");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B t = new B();
	}
}
