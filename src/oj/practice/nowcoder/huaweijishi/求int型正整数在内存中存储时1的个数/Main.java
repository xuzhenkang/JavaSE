package oj.practice.nowcoder.huaweijishi.��int�����������ڴ��д洢ʱ1�ĸ���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int result = 0, n = cin.nextInt();
		while (n > 0) {
			if (n % 2 != 0) result++;
			n >>= 1;
		}
		System.out.println(result);
		cin.close();
	}
}
