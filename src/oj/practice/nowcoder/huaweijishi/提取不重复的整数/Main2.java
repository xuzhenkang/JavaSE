package oj.practice.nowcoder.huaweijishi.��ȡ���ظ�������;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = 0, n = cin.nextInt();
		int[] a = new int[10];
		
		while (n != 0) {
			if (a[n % 10] == 0) {
				a[n % 10]++; //��һ���Ǹ��£������´���ͬ����������
				num = num * 10 + n % 10;
			}
			n /= 10;
		}
		System.out.println(num);
		cin.close();
	}
}
// ���⣡ Ӧ��ѧϰѧϰ����Ľⷨ��
