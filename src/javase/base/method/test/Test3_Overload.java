package javase.base.method.test;
/*
* A:������ʾ
	* ���󣺱Ƚ����������Ƿ���ȡ�
	* �������ͷֱ�Ϊ����int���ͣ�����double���ͣ�����main�����н��в���

*/
class Test3_Overload {
	public static void main(String[] args) {
		boolean b1 = isEquals(10,10);
		System.out.println(b1);

		boolean b2 = isEquals(10.5,10.5);
		System.out.println(b2);
	}

	/*
	�Ƚ����������Ƿ����
	1,����ֵ����boolean
	2,�����б�int a,int b
	*/

	public static boolean isEquals(int a,int b) {
		return a == b;
	}

	/*
	�Ƚ����������Ƿ����
	1,����ֵ����boolean
	2,�����б�double a,double b
	*/

	public static boolean isEquals(double a,double b) {
		return a == b;
	}
}
