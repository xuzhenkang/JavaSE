package acmcoder.renren.求和A;

/**
人人公司2017校园招聘 技术综合 在线考试
编程题 | 30分 3/3
求和A
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
小B正处于百无聊赖中，提不起干活的兴趣。看到桌面上的一条带着方格纸带，于是随手拿起一支笔，在纸带的每个方格中写上一个随机想起的数字。然后把纸带折起来撕成两半，她突然发现两半中各个数值加起来的和竟然是一样的。小B一下子有了一点精神，她想知道可以有多少种方式把纸带撕成两半，仍然使得两边的数值之和是相等的。
你能帮她吗！

输入
测试数据有多组，每组测试数据的第一行为一个整数n（1=< n <=100000），为纸带上的方格数，第二行为n个空格分隔的数值，为小B写入方格的数值，所有的数都是绝对值不超过10000的整数。
输出
对每组测试数据，在单独的行中输出不同撕法的总数，使得两边纸带中的数值之和相等。将纸带撕成两半时，只能沿方格的边缘撕开。

样例输入
3
1 1 1
9
1 5 -6 7 9 -16 0 -2 2
2
0 0
样例输出
0
3
1
 * @author Dan
 *
 */
import java.util.Scanner;
public class Main {
	private static long getSum(int[] array, int from, int to) {
		long sum = 0;
		for (int i = from; from <= to && i <= to; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();// 纸带的格子数
			int[] a = new int[n]; // 纸带
			for (int i = 0; i < n; i++) { // 初始化纸带
				a[i] = cin.nextInt();
			}
			int count = 0;
			for (int i = 1; i < n; i++) {
				System.out.print("getSum(a, 0, i-1)=" + getSum(a, 0, i-1));
				System.out.println(" getSum(a, i, n-1)=" + getSum(a, i, n-1));
				if (getSum(a, 0, i-1) == getSum(a, i, n-1)) {
					count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
