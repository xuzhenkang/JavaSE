package oj.gettingjob.acmcoder.ctrip.chengjizuida;

import java.util.Scanner;

/**
 * 乘积最大 时间限制：C/C++语言 3MS；其他语言 2003MS 内存限制：C/C++语言 65536KB；其他语言 589824KB 题目描述：
 * 有一个整数n，将n分解成若干个不同自然数之和，问如何分解能使这些数的乘积最大，输出这个乘积m 输入 一个整数，不超过50 输出 一个整数
 * 
 * 样例输入 15 样例输出 144
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
