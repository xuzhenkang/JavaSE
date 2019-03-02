package oj.gettingjob.nowcoder.youdao.kuohao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int compute(char[] str1, char[] str2) {
		int substringLength1 = str1.length;
		int substringLength2 = str2.length;

		// 构造二维数组记录子问题A[i]和B[j]的LCS的长度
		int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];

		// 从后向前，动态规划计算所有子问题。也可从前到后。
		for (int i = substringLength1 - 1; i >= 0; i--) {
			for (int j = substringLength2 - 1; j >= 0; j--) {
				if (str1[i] == str2[j])
					opt[i][j] = opt[i + 1][j + 1] + 1;// 状态转移方程
				else
					opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);// 状态转移方程
			}
		}
		return opt[0][0];
	}

	public static int computeLCS(String str1, String str2) {
		return compute(str1.toCharArray(), str2.toCharArray());
	}

	public static void backtrack(List<String> list, String str, int open, int close, int max) {

		if (str.length() == max * 2) {
			list.add(str);
			return;
		}

		if (open < max)
			backtrack(list, str + "(", open + 1, close, max);
		if (close < open)
			backtrack(list, str + ")", open, close + 1, max);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		backtrack(list, "", 0, 0, n);
		return list;
	}

	public static int getN(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str = cin.nextLine();
			int n = getN(str);
			List<String> lists = generateParenthesis(n);

			int max = 0, maxSum = 0;
			for (int i = 0; i < lists.size(); i++) {
				if (lists.get(i).equals(str))
					continue;
				int k = computeLCS(str, lists.get(i));
				if (k > max) {
					max = k;
				}
			}
			for (int i = 0; i < lists.size(); i++) {
				if (lists.get(i).equals(str))
					continue;
				int k = computeLCS(str, lists.get(i));
				if (k == max) {
					maxSum++;
				}
			}
			System.out.println(maxSum);
		}
		cin.close();
	}
}
