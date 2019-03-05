package oj.gettingjob.acmcoder.toutiao.最大点集;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		int n = cin.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = cin.nextInt();
			}
		}
		Arrays.sort(a[0]);
		int yMax = a[n-1][1];
		treemap.put(a[n-1][0], a[n-1][1]);
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i][1] > yMax) {
				treemap.put(a[i][0], a[i][1]);
				yMax = a[i][1];
			}
		}
		for (Integer i : treemap.keySet()) {
			System.out.println(i + " " + treemap.get(i));
		}
		cin.close();
	}
}
