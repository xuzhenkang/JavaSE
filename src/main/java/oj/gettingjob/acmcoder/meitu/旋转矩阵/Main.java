package oj.gettingjob.acmcoder.meitu.旋转矩阵;

import java.util.Scanner;

/**
 * xuanzhuanjuzhen
 * 
 * @author window
 */
public class Main {
	static void spiral_all(int arr[][], int m, int n)// m行 n列
	{
		int i = 1;
		int u = 0, d = m - 1;
		int l = 0, r = n - 1;
		int chg;
		for (; u < d && l < r; u++, d--, l++, r--) {
			for (chg = l; chg < r; chg++) {
				arr[u][chg] = i++;
			}
			for (chg = u; chg < d; chg++) {
				arr[chg][r] = i++;
			}
			for (chg = r; chg > l; chg--) {
				arr[d][chg] = i++;
			}
			for (chg = d; chg > u; chg--) {
				arr[chg][l] = i++;
			}
		}
		if (r == l) {
			for (chg = u; chg <= d; chg++) {
				arr[chg][l] = i++;
			}
		} else if (u == d) {
			for (chg = l; chg <= r; chg++) {
				arr[u][chg] = i++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[][] a;
		int m, n;
		while (cin.hasNext()) {
			m = cin.nextInt();// 行数
			n = cin.nextInt();// 列数
			a = new int[m][n];
			spiral_all(a, m, n);
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}

		}
		cin.close();

	}
}
