package javase.oo.final_keyword;

class Demo3_Final {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
/*
* A:final���α����ĳ�ʼ��ʱ��
	* ��ʾ��ʼ�� 
	* �ڶ��������ǰ����
*/

class Demo {
	final int num;						//��Ա������Ĭ�ϳ�ʼ��ֵ����Чֵ
	
	public Demo() {
		num = 10;
	}
	public void print() {
		System.out.println(num);
	}
}