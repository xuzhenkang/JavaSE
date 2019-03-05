package javase.oo.innerclass.anonymous_innerclass;

class Demo2_NoNameInnerClass {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.method();
	}
}

interface Inter1 {
	public void show1();
	public void show2();
}
//匿名内部类只针对重写一个方法时候使用
class Outer1 {
	public void method() {
		/*new Inter(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/

		Inter1 i = new Inter1(){
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}

			/*public void show3() {
				System.out.println("show3");
			}*/
		};

		i.show1();
		i.show2();
		//i.show3();						//匿名内部类是不能向下转型的,因为没有子类类名
	}
}