package oj.gettingjob.acmcoder.qunar.convert;

import java.util.Scanner;
/**
 * 去哪儿2017校园招聘 软件开发工程师 在线考试
编程题 | 30分 2/3
进制转换
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
用英文字母a-z来分别表示数值0-25, 形成一个26进制的数值表示法。需要你写一个方法，将用a-z表示的26进制数值的字符串，转化为对应的10进制数值。

输入
输入数据有多组，每组占一行，包含多个a-z之间的字符。

输出
所对应表示的10进制数。


样例输入
ba
bcd
gibbon
goodboy

样例输出
26
731
74962693
2026285376


Hint
做进制转换逻辑。
温馨提示
请尽量在全场考试结束10分钟前调试程序，否则由于密集排队提交，可能查询不到编译结果 
点击“调试”亦可保存代码
编程题可以使用本地编译器，此页面不记录跳出次数
 * @author Dan
 *
 */
public class Main {
	public static long solve(String s) {
		long result = 0L;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + s.charAt(i) - 'a';
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			System.out.println(solve(cin.nextLine()));
		}
		cin.close();
	}
}
