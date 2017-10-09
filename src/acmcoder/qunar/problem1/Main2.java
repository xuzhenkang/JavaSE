package acmcoder.qunar.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		cin.nextLine();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			String str = cin.nextLine();
			char[] chs = str.toCharArray();
			for (int j = 0; j < m; j++) {
				if (chs[j] == 'x')
					arr[i][j] = 0;
				else
					arr[i][j] = 1;
			}
		}
		int r1 = 0, r2 = 0;
		for (int i = 0; i < m; i += 2) {
			for (int j = 0; j < n; j++) {
				r1 += arr[j][i];
			}
		}
		for (int i = 1; i < m; i += 2) {
			for (int j = 0; j < n; j++) {
				r2 += arr[j][i];
			}
		}
		System.out.println(Math.max(r1, r2));
		cin.close();
	}

}
