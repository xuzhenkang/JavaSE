package oj.gettingjob.acmcoder.qunar.problem2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			Map<String, Integer> names = new HashMap<>();
			String[] nums = cin.nextLine().split(" ");
			int m = Integer.parseInt(nums[0]);
			int n = Integer.parseInt(nums[1]);
			int k = 0;
			int[][] mp = new int[m][m];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					if (i == j) mp[i][j] = 0;
					else mp[i][j] = Integer.MAX_VALUE;
				}
			}
			String[] lines = cin.nextLine().split(" ");
			for (int i = 0; i < n; i++) {
				if (names.containsKey(lines[2 * i]))
					names.put(lines[2*i], k++);
			}
		}
		cin.close();
	}
}
