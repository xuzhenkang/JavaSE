package oj.practice.nowcoder.huaweijishi.提取不重复的整数;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = 0, n = cin.nextInt();
		int[] a = new int[10];
		
		while (n != 0) {
			if (a[n % 10] == 0) {
				a[n % 10]++; //这一步是更新，遇到下次相同的数会跳过
				num = num * 10 + n % 10;
			}
			n /= 10;
		}
		System.out.println(num);
		cin.close();
	}
}
// 正解！ 应该学习学习此题的解法。
