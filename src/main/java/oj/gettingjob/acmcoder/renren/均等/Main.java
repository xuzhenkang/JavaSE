package oj.gettingjob.acmcoder.renren.均等;

/**
人人公司2017校园招聘 技术综合 在线考试
编程题 | 20分 1/3
均等
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
一天，小明带来了一大堆巧克力，共n条且长短不一。他想分成每条都相同长度的巧克力条分给同事，但又想偷懒，于是他想知道在能均分巧克力的前提下，用最少分割次数分割后能得到的巧克力的长度是多少。
输入
输入第一行一个整数n(1<=n<=50)，表示巧克力条数。
接下来第二行n个整数Li(1<=Li<=100000)，分别表示第i条巧克力的长度。
输出
输出一行一个整数，表示用最少分割次数分割后能得到的巧克力的长度。

样例输入
4
4 22 8 12
样例输出
2
 */
import java.util.Scanner;

public class Main {

	private static int getMinEle(int[] a) {
		if (a.length < 1) {
			return -1;
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	public static int getMaxCommon(int[] array) {
		int minN = getMinEle(array);
		for (int j = minN; j >= 1; j--) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % j == 0) {
					count++;
				}
			}
			if (count == array.length) {
				return j;
			}
		}
		return -1;// 无最大公约数
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int len = cin.nextInt();
			int[] array = new int[len];
			for (int i = 0; i < len; i++) {
				array[i] = cin.nextInt();
			}
			System.out.println(getMaxCommon(array));
		}
		cin.close();
	}
}
