package javase.base.operator.ternary_operator.test;
/*
* A:������ʾ
	* ����¼����ϰ������¼���������ݣ��Ƚ������������Ƿ����
* B:������ʾ
	* ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
*/
import java.util.Scanner;							//����
class Test3_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������¼�����

		//����¼����ϰ������¼���������ݣ��Ƚ������������Ƿ����
		/*System.out.println("�������һ������:");
		int x = sc.nextInt();						//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();						//������¼������ݴ洢��y��

		//boolean b = (x == y)? true : false;
		boolean b = (x == y);
		System.out.println(b);*/

		//����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
		System.out.println("�������һ������:");
		int x = sc.nextInt();						//������¼������ݴ洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();						//������¼������ݴ洢��y��
		System.out.println("���������������:");
		int z = sc.nextInt();						//������¼������ݴ洢��y��

		//������ʱ������¼ס�Ƚϳ�ǰ���������е����ֵ
		int temp = (x > y) ? x : y;
		//���ȽϺ�Ľ��������������е�ֵ�Ƚ�,�Ƚϳ��������е����ֵ
		int max = (temp > z) ? temp : z;
		System.out.println(max);
	}
}
