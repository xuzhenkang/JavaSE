package javase.base.operator.bit_operator;

class Demo2_Operator {
	public static void main(String[] args) {
		/*
		* λ�����������ص�

		* ^���ص㣺һ�����ݶ���һ������λ������Σ����������䡣
		*/

		//System.out.println(5 ^ 10 ^ 10);
		//System.out.println(5 ^ 10 ^ 5);

		/*
		* ���Լ�ʵ���������������Ľ���(����Ҫ�������������)
		* ע�⣺�Ժ󽲿εĹ����У���û����ȷָ�����ݵ����ͣ�Ĭ��int���͡�
		*/

		int x = 10;
		int y = 5;

		//��Ҫ����������,�����Ƽ�������
		/*int temp;
		temp = x;
		x = y;
		y = temp;*/

		//����Ҫ�������������,�б׶�,�п��ܻᳬ��int��ȡֵ��Χ
		/*x = x + y;				//10 + 5 = 15
		y = x - y;				//15 - 5 = 10
		x = x - y;				//15 - 10 = 5*/

		//����Ҫ����������,ͨ��^����
		x = x ^ y;				// 10 ^ 5 
		y = x ^ y;				// 10 ^ 5 ^ 5	y = 10
		x = x ^ y;				// 10 ^ 5 ^ 10  x = 5

		System.out.println("x = " + x + ",y = " + y);
	}
}
