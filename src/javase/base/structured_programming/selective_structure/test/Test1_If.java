package javase.base.structured_programming.selective_structure.test;
import java.util.Scanner;
class Test1_If {
	public static void main(String[] args) {
		/*
		* A:��ϰ1
		* 
				���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
				90-100 ��
				80-89  ��
				70-79  ��
				60-69  ��
				0-59   ��
				
		* B:��ϰ2
			* ����
				* ����¼��x��ֵ�������y�Ĳ������
				
				* x>=3	y = 2 * x + 1;
				* -1<x<3	y = 2 * x;
				* x<=-1	y = 2 * x - 1;
		*/
		Scanner sc = new Scanner(System.in);

		//���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		/*System.out.println("������ѧ���ɼ���Χ��1��100֮��");
		int x = sc.nextInt();

		if (x >= 90 && x <= 100) {
			System.out.println("��");
		}else if (x >= 80 && x <= 89 ) {
			System.out.println("��");
		}else if (x >= 70 && x <= 79 ) {
			System.out.println("��");
		}else if (x >= 60 && x <= 69 ) {
			System.out.println("��");
		}else if (x >= 0 && x <= 59 ) {
			System.out.println("��");
		}else {
			System.out.println("�ɼ�¼�����");
		}*/

		//���� ����¼��x��ֵ�������y�Ĳ����
		System.out.println("������һ������:");
		int x = sc.nextInt();
		int y = 0;
		if (x >= 3) {
			y = 2 * x + 1;
		}else if (x > -1 && x < 3) {
			y = 2 * x;
		}else if (x <= -1) {
			y = 2 * x - 1;
		}

		System.out.println(y);
	}
}
