package javase.oo.innerclass.anonymous_innerclass.test;

class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		//Outer.method().show();			//��ʽ���,ÿ�ε��÷������ܼ������÷���,֤�����÷������ص��Ƕ���
		Inter2 i = Outer2.method();
		i.show();
	}
}
//����Ҫ�󣬲������
interface Inter2 { 
	void show(); 
}

class Outer2 { 
	//������� 
	public static Inter2 method() {
		return new Inter2() {
			public void show() {
				System.out.println("show");
			}
		};
	}
}

//Ҫ���ڿ���̨�����HelloWorld��