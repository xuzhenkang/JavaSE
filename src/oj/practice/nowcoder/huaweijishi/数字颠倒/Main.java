package oj.practice.nowcoder.huaweijishi.���ֵߵ�;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int number = cin.nextInt();
		while (number != 0) {
			System.out.print(number % 10);
			number /= 10;
		}
		System.out.println();
		cin.close();
	}
}

/*
 * ����python ֻ��һ�д��룺
 * print raw_input()[::-1]
 */
