package javase.base.operator.ternary_operator.test;
class Test1_Operator {
	public static void main(String[] args) {
		/*
		* A:������ʾ
			* �Ƚ����������Ƿ���ͬ
		* B:������ʾ
			* ��ȡ���������е����ֵ
		*/

		//�Ƚ����������Ƿ���ͬ

		/*int x = 10;
		int y = 10;

		//boolean b = (x == y) ? true : false;
		boolean b = (x == y);
		System.out.println("b = " +  b);*/

		//��ȡ���������е����ֵ
		int a = 10;
		int b = 20;
		int c = 30;

		//�ȱȽ�������������ֵ,�ҳ����������е����ֵ
		int temp = (a > b) ? a : b;
		//��ǰ�����������ֵ����������Ƚ�,��ȡ���ֵ
		int max = (temp > c) ? temp : c;
		System.out.println("max =" + max);
	}
}
