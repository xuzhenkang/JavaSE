package javase.base.operator.ternary_operator;

/*
* a:����
		* ��ʽ��
			* import java.util.Scanner; 
		* λ�ã�
			* ��class���档
	* b:��������¼�����
		* ��ʽ��
			* Scanner sc = new Scanner(System.in);
	* c:ͨ�������ȡ����	
		* ��ʽ��
			* int x = sc.nextInt();
*/
import java.util.Scanner;
class Demo2_Scanner {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);			//��������¼�����
		System.out.println("������һ������:");
		int x = sc.nextInt();							//������¼������ݴ洢��x��
		System.out.println(x);*/

		//¼����������
		Scanner sc = new Scanner(System.in);			//��������¼�����
		System.out.println("�������һ������:");
		int x = sc.nextInt();							//������¼������ݴ洢��x��
		System.out.println(x);

		System.out.println("������ڶ�������:");
		int y = sc.nextInt();							//������¼������ݴ洢��y��
		System.out.println(y);
	}
}
