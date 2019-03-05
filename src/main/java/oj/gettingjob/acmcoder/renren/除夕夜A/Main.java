package oj.gettingjob.acmcoder.renren.除夕夜A;
/**
 * 人人公司2017校园招聘 技术综合 在线考试
编程题 | 20分 2/3
除夕夜A
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
在大年三十的晚上，小明不想看春晚，就在网上报名了一场网络程序设计比赛，比赛将于20:00开始，持续4个小时，之到午夜。比赛中会有n个问题，按照难度排序，也就是说，第一个问题是最简单的，最后一个问题是最难的。小明知道他解决第k个问题需要k * 5分钟。小明的父母允许小明不看春晚，但要求他必须参加跨年，就是小明必须在12.00或者12.00之前赶到客厅和父母一起跨年。他需要m分钟从房间走到客厅。请问，小明在去参加跨年之前最多能解决多少问题。
输入
每个样例输入两行，每行一个整数，n和m，(1 ≤ n ≤ 10, 1 ≤ m ≤ 240) 。
输出
输出小明最多能解决的问题数。

样例输入
4
210
样例输出
3
 * @author Dan
 *
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(); // n个问题
			int m = cin.nextInt(); // m从房间到客厅的时间
			int sum = 0, i = 1;
			for (; (sum + m) <= 240 && i < n+2; i++) { // 最多就能解决9个问题。
				sum += i * 5;
//				System.out.println("sum + m = " + (sum + m));
//				System.out.println("sum = " + sum);
//				System.out.println("i = " + i);
			}
			System.out.println(i-2);
		}
		cin.close();
	}
}
