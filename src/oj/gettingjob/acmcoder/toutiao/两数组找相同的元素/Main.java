package oj.gettingjob.acmcoder.toutiao.两数组找相同的元素;

/**
 * 两数组找相同的元素-array
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
给两个整数(int)数组，输出相同的元素。
输入
给定两个整型数组[a1, a2, ...., am]，[b1, b2, ..., bn]
输入格式如下，第一行给定第一个数组的大小m，接下来的m行为其数组元素a1 -- am，每行一个元素；第m+1行为第二个数组的大小n，接下来的n行为其数组元素b1 -- bn，也是每行一个元素。示例如下：
m
a1
a2
…
am
n
b1
b2
…
bn

输出
两个数组中相同的元素，以空格分隔在一行中显示，显示顺序为其在第二个数组中出现的顺序。

样例输入
5
11
15
9
12
3
4
11
3
9
7
样例输出
11 3 9
 * @author Dan
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int[] am = new int[m];
			for (int i = 0; i < m; i++) {
				am[i] = cin.nextInt();
			}
			int n = cin.nextInt();
			int[] an = new int[n];
			for (int i = 0; i < n; i++) {
				an[i] = cin.nextInt();
			}
			ArrayList<Integer> arrayList = contains(am, an);
			for (int i : arrayList) {
				System.out.print(i + " ");
			}
		}
		cin.close();
	}

	public static ArrayList<Integer> contains(int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					result.add(b[i]);
					break;
				}
			}
		}
		return result;
	}
}
