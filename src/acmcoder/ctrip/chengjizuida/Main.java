package acmcoder.ctrip.chengjizuida;

import java.util.Scanner;

/**
 * �˻���� ʱ�����ƣ�C/C++���� 3MS���������� 2003MS �ڴ����ƣ�C/C++���� 65536KB���������� 589824KB ��Ŀ������
 * ��һ������n����n�ֽ�����ɸ���ͬ��Ȼ��֮�ͣ�����ηֽ���ʹ��Щ���ĳ˻�����������˻�m ���� һ��������������50 ��� һ������
 * 
 * �������� 15 ������� 144
 * 
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] num = new int[50];
		int i = 0, n;
		while (cin.hasNext()) {
			n = cin.nextInt();
			for (int j = 2; j <= n; j++) {
				num[i++] = j;
				n -= j;
			}
			if (0 != n) {
				if (n == i + 1) {
					num[i - 1]++;
					n--;
				}
				for (int j = 0; j < n; j++) {
					num[i - j - 1]++;
				}
			}
			int max = 1;
			for (int j = 0; j < i; j++) {
				max *= num[j];
			}
			System.out.println(max);
		}
		cin.close();
	}
}
