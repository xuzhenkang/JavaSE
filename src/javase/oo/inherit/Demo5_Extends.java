package javase.oo.inherit;

class Demo5_Extends {
	public static void main(String[] args) {
		Son2 s = new Son2();
	}
}
/*
* A:������ʾ
	* ���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
* B:Ϊʲô��?
	* ��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
	* ���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
	
	* ��ʵ��
		* ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super() Object�����ĸ��ࡣ
*/

class Father2 extends Object {
	public Father2() {
		super();
		System.out.println("Father �Ĺ��췽��");
	}
}

class Son2 extends Father2 {
	public Son2() {
		super();							//����һ�����,�����д,ϵͳ��Ĭ�ϼ���,�������ʸ����еĿղι���
		System.out.println("Son �Ĺ��췽��");
	}
}