package javase.base.method;
/*
* A:������ʾ
	* ���󣺸��ݼ���¼����������������ڿ���̨�������
* B:�������ã�
	* ��������
	* �������(����)
	* ��ֵ����(����)
*/
import java.util.Scanner;
class Demo3_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//��������¼�����
		System.out.println("����������:");
		int row = sc.nextInt();							//������¼��������洢��row��
		System.out.println("����������:");
		int column = sc.nextInt();						//������¼��������洢��column��
		
		//System.out.println(print(row,column));		//����: �˴�������ʹ�� '��' ����,����ֵ��void�ķ��������������
		//����ֵ��void�ķ���ֻ�ܵ�������
		print(row,column);
	}

	/*
	�ڿ���̨�����������
	1,��ȷ����ֵ����,������û�о���ķ���ֵ����,void
	2,��ȷ�����б�int a,int b
	*/

	public static void print(int a,int b) {
		for (int i = 1;i <= a ;i++ ) {					//����
			for (int j = 1;j <= b ;j++ ) {				//����
				System.out.print("*");
			}
			System.out.println();
		}

		//return ;										//�������ֵ������void,return����ʡ��,��ʹʡ��ϵͳҲ��Ĭ�ϸ�����,��ʽ��return;
	}
}
