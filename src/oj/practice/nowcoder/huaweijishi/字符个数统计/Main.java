package oj.practice.nowcoder.huaweijishi.�ַ�����ͳ��;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[128];
		int count = 0;
		String str = cin.nextLine();
		for (char c : str.toCharArray()) {
			if (a[c] == 0) {
				a[c]++;
				count++;
			}
		}
		System.out.println(count);
		cin.close();
	}
}
// �� ����ȡ���ظ���������һ���˼·һ�£�ʹ��һ���������飬������ӡ�