package javase.oo.innerclass.anonymous_innerclass;

class Demo1_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
/*
* A:�����ڲ���
	* �����ڲ���ļ�д����
* B:ǰ�᣺����һ������߽ӿ�
	* �����������Ǿ�����Ҳ�����ǳ����ࡣ
* C:��ʽ��
* 
		new �������߽ӿ���(){
			��д����;
		}
* D:������ʲô��?
	* ��һ���̳��˸������ʵ���˸ýӿڵ�������������
* E:������ʾ
	* ����Ҫ����һ�������ڲ���
*/

interface Inter {
	public void print();
}

class Outer {
	class Inner implements Inter {
		public void print() {
			System.out.println("print");
		}
	}

	public void method(){
		//Inner i = new Inner();
		//i.print();
		//new Inner().print();
		//Inter i = new Inner();			//��������ָ���������
		
		new Inter() {						//ʵ��Inter�ӿ�
			public void print() {			//��д���󷽷�
				System.out.println("print");
			}
		}.print();
	}
}