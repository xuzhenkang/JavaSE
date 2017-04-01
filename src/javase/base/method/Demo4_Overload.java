package javase.base.method;
/*
����:��������ͬ,�����б�ͬ,�뷵��ֵ�����޹�
���صķ���
1,����������ͬ
2,�������Ͳ�ͬ
	˳��ͬ
*/
class Demo4_Overload {						//overload����
	public static void main(String[] args) {
		double sum1 = add(10,20.1);
		System.out.println(sum1);

		int sum2 = add(10,20,30);
		System.out.println(sum2);

		double sum3 = add(12.3,13);
		System.out.println(sum3);
	}

	/*
	�����������ĺ�
	1,����ֵ����int
	2,�����б� int a,int b
	*/

	public static double add(int a,double b) {
		return a + b;
	}

	/*
	�����������ĺ�
	1,����ֵ����int
	2,�����б� int a,int b,int c
	*/

	public static int add(int a,int b,int c) {
		return a + b + c;
	}

	/*
	������С���ĺ�
	1,����ֵ����double
	2,�����б� double a,double b
	*/

	public static double add(double a,int b) {
		return a + b;
	}
}
