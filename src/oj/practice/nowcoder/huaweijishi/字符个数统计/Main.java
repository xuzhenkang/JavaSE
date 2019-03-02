package oj.practice.nowcoder.huaweijishi.字符个数统计;

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
// 与 “提取不重复的整数”一题的思路一致，使用一个辅助数组，用来填坑。