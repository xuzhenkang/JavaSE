package oj.practice.nowcoder.huaweijishi.数字颠倒;

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
 * 利用python 只需一行代码：
 * print raw_input()[::-1]
 */
