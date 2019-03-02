package javase.oo.innerclass.static_innerclass;

class Test1_InnerClass {
	public static void main(String[] args) {
		Outer1.Inner oi = new Outer1().new Inner();
		oi.show();
	}
}
//要求：使用已知的变量，在控制台输出30，20，10。
//内部类之所以能获取到外部类的成员,是因为他能获取到外部类的引用外部类名.this
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
