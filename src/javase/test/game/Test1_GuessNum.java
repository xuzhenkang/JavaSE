package javase.test.game;

/*
* A:������ʾ
	* ���󣺲�����С��Ϸ(������1-100֮��)
*/
import java.util.Scanner;
class Test1_GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		System.out.println("������һ������,��Χ��1-100֮��");
		int guessNum = (int)(Math.random() * 100) + 1;		//������������
		while (true) {										//��Ϊ��Ҫ�ºܶ��,����������ѭ��
			int result = sc.nextInt();						//��Ҳµ���
			if (result > guessNum) {						//������ǲµ��������������������
				System.out.println("����");					//��ʾ����
			} else if (result < guessNum) {					//������ǲµ���С���������������
				System.out.println("С��");					//��ʾС��
			} else {										//����Ȳ���Ҳ��С
				System.out.println("����");					//����
				break;
			}
		}
	}
}

