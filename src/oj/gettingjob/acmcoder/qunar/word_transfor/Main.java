package oj.gettingjob.acmcoder.qunar.word_transfor;

import java.util.Scanner;
/**
 * 去哪儿2017校园招聘 软件开发工程师 在线考试
编程题 | 40分 3/3
单词变换
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
有一个单词列表，一个初始单词和一个最终单词，初始单词需要通过单词列表逐步变换到最终单词，求变换所需的最短变换路径长度。
变换规则：每次只能变动1个字母（不可交换位置，如：从abc变成cba属于变动了2个字母），每次变换只能从单词列表中选取。
例如：初始单词hot，最终单词dog，单词列表[got, dot, god, dog, lot, log]，最短变换路径为[hot,dot,dog]，最短变换路径长度为3。
注：单词列表中包含最终单词，不包含初始单词；列表中每一项单词长度与初始单词、最终单词相同；列表中单词不重复；所有字母均为小写。

输入
输入数据有三行，第一行为初始单词；第二行为最终单词；第三行为单词列表，单词和单词之间以空格分割。

输出
最短变换路径长度。


样例输入
hot
dog
got dot god dog lot log

样例输出
3

Hint
寻找最短路径相关算法。

温馨提示
请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果 
点击“调试”亦可保存代码
编程题可以使用本地编译器，此页面不记录跳出次数
 * @author Dan
 *
 */
public class Main {

	static int diffAt(String a, String b, int diff) {
		int i = diff;
		for (; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int step;
		String begin, end;
		String[] dict;
		while (cin.hasNext()) {
			step = 1;
			begin = cin.nextLine();
			end = cin.nextLine();
			dict = cin.nextLine().split(" ");
			int diffAt = diffAt(begin, end, 0);
			//System.out.println(diffAt);
			while (diffAt != -1) {
				int k = 0;
				for (int i = 0; i < dict.length; i++) {
					String temp = begin.substring(0, diffAt) + end.charAt(diffAt) + begin.substring(diffAt + 1);
					if (temp.equals(dict[i])) {
						begin = temp;
						System.out.println(temp);
						step++;
						k++;
						//System.out.println(step);
					} 
				}
				if (k == 0) {
					diffAt = diffAt(begin, end, diffAt);
				} else diffAt = diffAt(begin, end, 0);
			}
			System.out.println(step);
		}
		cin.close();
	}
	
	/*public static void main(String[] args) {
		String s = "hot", t = "dog";
		int d = getEditDistance(s, t);
		System.out.println(d);
	}

	// 返回三者最小值
	private static int Minimum(int a, int b, int c) {
		int im = a < b ? a : b;
		return im < c ? im : c;
	}

	public static int getEditDistance(String s, String t) {
		int d[][]; // matrix
		int n; // length of s
		int m; // length of t
		int i; // iterates through s
		int j; // iterates through t
		char s_i; // ith character of s
		char t_j; // jth character of t
		int cost; // cost

		// Step 1
		n = s.length();
		m = t.length();
		if (n == 0) {
			return m;
		}
		if (m == 0) {
			return n;
		}
		d = new int[n + 1][m + 1];

		// Step 2
		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}
		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}

		// Step 3
		for (i = 1; i <= n; i++) {
			s_i = s.charAt(i - 1);
			// Step 4
			for (j = 1; j <= m; j++) {
				t_j = t.charAt(j - 1);
				// Step 5
				cost = (s_i == t_j) ? 0 : 1;
				// Step 6
				d[i][j] = Minimum(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + cost);
			}
		}
		// print(d, m, n);
		return d[n][m];
	}

	public static void print(int d[][], int m, int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	
	
}
// asdf
// ddff
// asff dffs
//



