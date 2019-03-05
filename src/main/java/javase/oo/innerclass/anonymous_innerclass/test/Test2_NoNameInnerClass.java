package javase.oo.innerclass.anonymous_innerclass.test;

class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		//Outer.method().show();			//链式编程,每次调用方法后还能继续调用方法,证明调用方法返回的是对象
		Inter2 i = Outer2.method();
		i.show();
	}
}
//按照要求，补齐代码
interface Inter2 { 
	void show(); 
}

class Outer2 { 
	//补齐代码 
	public static Inter2 method() {
		return new Inter2() {
			public void show() {
				System.out.println("show");
			}
		};
	}
}

//要求在控制台输出”HelloWorld”orld��