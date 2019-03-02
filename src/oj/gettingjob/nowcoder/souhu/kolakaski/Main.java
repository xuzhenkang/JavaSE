package oj.gettingjob.nowcoder.souhu.kolakaski;

import java.util.ArrayList;
import java.util.Scanner;

/*
输入
6 2
1 2

 1   2  2  1  1  2  1  2 2
[1] [2, 2][1, 1][2][1][2,2][1]




输入：
30 4
2 1 3 1
输出：
 2 2  1 1  3  1  2 2 2
[2,2][1,1][3][1][2,2,2]

 */
public class Main {
	public static ArrayList<Integer> f(int[] a, int n) {
		ArrayList<Integer> kolakaski = new ArrayList<>();
		for (int position = 0, times = 0; position <= n; ) {
			for (int i = 0; i < a.length; i = (i + 1) % a.length) {
				int length = kolakaski.isEmpty() ? a[i] : kolakaski.get(position);
				for (int j = 0; j < length; j++) {
					kolakaski.add(a[i]);
					times++;
					if (times >= n)
						return kolakaski;
				}
				position++;
			}
		}
		return kolakaski;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int[] a = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = cin.nextInt();
			}
			f(a, n).forEach(System.out::println);
		}
		cin.close();
	}
}
