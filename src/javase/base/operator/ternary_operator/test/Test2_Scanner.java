package javase.base.operator.ternary_operator.test;
import java.util.Scanner;						//������е���Scanner
class Test2_Scanner {
	/*
	* A:������ʾ
		* ����¼����ϰ������¼���������ݣ�����������������ͣ��������
	* B:������ʾ
		* ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ

	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//��������¼�����
		
		//����¼����ϰ������¼���������ݣ�����������������ͣ��������
		/*System.out.println("�������һ������:");
		int x = sc.nextInt();					//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();					//������¼������ݴ洢��y��
		int sum = x + y;
		System.out.println(sum);*/

		//����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
		System.out.println("�������һ������:");
		int x = sc.nextInt();					//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();					//������¼������ݴ洢��y��

		int max = (x > y) ? x : y;				//��ȡx��y�е����ֵ
		System.out.println("max = " + max);
	}
}
