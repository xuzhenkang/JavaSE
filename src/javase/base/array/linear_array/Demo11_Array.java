package javase.base.array.linear_array;
/*
* A:������ʾ
	* ������(���ݼ���¼������,���Ҷ�Ӧ����)
*/
import java.util.Scanner;
class Demo11_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ӧ�����ڷ�Χ��1-7");
		int week = sc.nextInt();

		System.out.println("����" + getWeek(week));
	}

	/*
	�����������ض�Ӧ������
	1,����ֵ����char
	2,�����б�int week
	*/

	public static char getWeek(int week) {
		char[] arr = {' ','һ','��','��','��','��','��','��'};		//������һ�����ڱ�
		return arr[week];											//ͨ��������ȡ���е�Ԫ��
	}
}
