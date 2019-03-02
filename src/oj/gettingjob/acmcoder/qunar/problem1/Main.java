package oj.gettingjob.acmcoder.qunar.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 部分和问题
public class Main {
	public static ArrayList<Integer> result = new ArrayList<>();
	public static boolean dfs(int[] arr, int i, int sum, int k) {
		if (i == arr.length)
			return sum == k;
		if (dfs(arr, i + 1, sum, k))
			return true;
		if (dfs(arr, i + 1, sum + arr[i], k)) {
			result.add(arr[i]);
			return true;
		}
		return false;
	}
	public static void solve(int[] arr, int k) {
		if (dfs(arr, 0, 0, k)) {
			System.out.println("YES");
			Collections.sort(result);
			result.forEach(t -> System.out.print(t + " "));
		} else {
			System.out.println("NO");
		}
		result.clear();
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int k = cin.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = cin.nextInt();
			}
			solve(arr, k);
		}
		cin.close();
	}
}
