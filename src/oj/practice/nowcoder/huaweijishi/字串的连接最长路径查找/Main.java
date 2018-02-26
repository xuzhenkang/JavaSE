package oj.practice.nowcoder.huaweijishi.字串的连接最长路径查找;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = cin.nextLine();
		}
		Arrays.sort(strs);
		for (String str : strs) {
			System.out.println(str);
		}
		cin.close();
	}
}
