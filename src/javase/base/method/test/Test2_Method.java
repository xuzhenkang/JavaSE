package javase.base.method.test;
/*
* A:������ʾ
	* ���󣺸��ݼ���¼������������Ӧ�ĳ˷���
*/
import java.util.Scanner;
class Test2_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������¼�����
		System.out.println("��¼��һ������,��Χ��1-9֮��");
		int num = sc.nextInt();						//������¼��������洢��num��
		print99(num);
	}

	/*
	��ӡ99�˷���
	1,����ֵ����void
	2,�����б�,int a
	*/

	public static void print99(int a) {
		for (int i = 1;i <= a ;i++ ) {					//����
			for (int j = 1;j <= i ;j++ ) {				//����
				System.out.print(j + "*" + i + "=" + (i * j) + "\t" );
			}
			System.out.println();
		}
	}
}
