package oj.gettingjob.acmcoder.renren.��ϦҹA;
/**
 * ���˹�˾2017У԰��Ƹ �����ۺ� ���߿���
����� | 20�� 2/3
��ϦҹA
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
�ڴ�����ʮ�����ϣ�С�����뿴�����������ϱ�����һ�����������Ʊ�������������20:00��ʼ������4��Сʱ��֮����ҹ�������л���n�����⣬�����Ѷ�����Ҳ����˵����һ����������򵥵ģ����һ�����������ѵġ�С��֪���������k��������Ҫk * 5���ӡ�С���ĸ�ĸ����С������������Ҫ��������μӿ��꣬����С��������12.00����12.00֮ǰ�ϵ������͸�ĸһ����ꡣ����Ҫm���Ӵӷ����ߵ����������ʣ�С����ȥ�μӿ���֮ǰ����ܽ���������⡣
����
ÿ�������������У�ÿ��һ��������n��m��(1 �� n �� 10, 1 �� m �� 240) ��
���
���С������ܽ������������

��������
4
210
�������
3
 * @author Dan
 *
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); // n������
			int m = cin.nextInt(); // m�ӷ��䵽������ʱ��
			int sum = 0, i = 1;
			for (; (sum + m) <= 240 && i < n+2; i++) { // �����ܽ��9�����⡣
				sum += i * 5;
//				System.out.println("sum + m = " + (sum + m));
//				System.out.println("sum = " + sum);
//				System.out.println("i = " + i);
			}
			System.out.println(i-2);
		}
		cin.close();
	}
}
