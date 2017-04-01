package javase.oo.polymorphic;

public class Demo2_Polymorphic {
	public static void main(String[] args) {
/*		Father f = new Son();			// 父类引用指向子类对象
		System.out.println(f.num);
		Son s = new Son();
		System.out.println(s.num);*/
		
		Father f = new Son();
		///f.print();
		f.method();						// 想当与Father.method()
	}
}

/*
成员变量
编译者看左边（父类），运行者看左边（父类）
成员方法
编译者看左边（父类），运行者看右边（子类）. 动态绑定
静态方法
 编译看左边，运行看右边
(静态和类相关，算不上重写，所以，访问还是左边的)
*/

class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	public static void method() {
		System.out.println("father static method");
	}
}

class Son extends Father {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("son static method");
	}
}