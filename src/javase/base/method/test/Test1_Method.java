package javase.base.method.test;
/*
* A:������ʾ
	* ���󣺼���¼���������ݣ������������еĽϴ�ֵ
* B:������ʾ
	* ���󣺼���¼���������ݣ��Ƚ��������Ƿ����     
*/
import java.util.Scanner;
class Test1_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		System.out.println("�������һ������:");
		int x = sc.nextInt();								//������¼��������洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();								//������¼��������洢��y��

		//int max = getMax(x,y);
		//System.out.println(max);

		boolean b = isEquals(x,y);
		System.out.println(b);
	}

	/*
	�������������Ľϴ�ֵ
	1,��ȷ����ֵ���� int
	2,��ȷ�����б� int a,int b
	*/
	public static int getMax(int a,int b) {
		return a > b ? a : b;
	}

	/*
	�ж����������Ƿ����
	1,��ȷ����ֵ���� boolean
	2,��ȷ�����б� int a,int b
	*/
	public static boolean isEquals(int a,int b) {		//isEquals �Ƿ����
		return a == b;
	}
}
