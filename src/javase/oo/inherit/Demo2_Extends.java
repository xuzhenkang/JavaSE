package javase.oo.inherit;

class Demo2_Extends {
	public static void main(String[] args) {
		DemoC d = new DemoC();
		d.show();
	}
}
/*
* A:Java����ļ̳��ص�
	* a:Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�(һ������ֻ����һ����)
		* ��Щ������֧�ֶ�̳У���ʽ��extends ��1,��2,...
	* b:Java֧�ֶ��̳�(�̳���ϵ)
* B:������ʾ
	* Java����ļ̳��ص�
		* ������������ϵ�����й�������ײ���ഴ������
		* ����뿴�����ϵ�Ĺ��Թ���,�������� 
*/
class DemoA {
	public void show() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void method() {
		System.out.println("DemoB");
	}
}

class DemoC extends DemoB {
	public void print() {
		System.out.println("DemoC");
	}
}