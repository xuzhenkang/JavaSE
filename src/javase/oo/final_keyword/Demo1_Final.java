package javase.oo.final_keyword;

class Demo1_Final {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
/*
* A:final����
	final�����յ�
* B:final�����ص�
	* �����࣬�಻�ܱ��̳�
	* ���α����������ͱ���˳�����ֻ�ܱ���ֵһ��
	* ���η������������ܱ���д
* C:������ʾ
	* final�����ص�
*/

/*final class Father {
	public void print() {
		System.out.println("���ʵײ�������Դ");
	}
}*/

class Son /*extends Father*/ {
	final int NUM = 10;						//���������淶,�����һ������,������ĸ��д,����Ƕ������,ÿ�����ʶ���д,�м����»��߸���
	public static final double PI = 3.14;	//final���α�����������,һ�����public static����
	public void print() {
		//NUM = 20;
		System.out.println(NUM);
	}
}