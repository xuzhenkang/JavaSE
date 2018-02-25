package oj.gettingjob.acmcoder.toutiao.DAU;

import java.util.HashSet;
import java.util.Scanner;

/**
 * DAU 统计
时间限制：C/C++语言 2000MS；其他语言 4000MS
内存限制：C/C++语言 32768KB；其他语言 557056KB
题目描述：
日活跃用户数 (DAU) 是衡量一个产品表现的重要指标。
需要编写程序，根据给定的某一天的 N 条访问记录，对当天的用户总数 M 进行统计。
每个用户可能访问多次。
为了方便，我们用数字 (uid) 唯一标识每个用户。
输入
每一行包含一个 uid，遇到 0 时认为输入结束。
输入共包含 N+1 行，可认为是无序的。
输出
一个数字：去重后 uid 的数量 M。

样例输入
12933
111111
59220
69433
59220
111111
0
样例输出
4

Hint
数据范围
0 < uid < 2^63
对于 30% 的数据，0 < N < 100,000, 0 < M < 100,000
对于 100% 的数据，0 < N < 1,000,000, 0 < M < 800,000
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashSet<String> stringSet = new HashSet<>();
//        String line = cin.nextLine();
//        while (!line.equals("0")) {
//            stringSet.add(line);
//            line = cin.nextLine();
//        }
        
		String line;
        do {
        	 line = cin.nextLine();
        	 if (!line.equals("0"))
        		 stringSet.add(line);
        } while (!line.equals("0"));
        
        System.out.println(stringSet.size());
        stringSet.clear();
		cin.close();
	}
}
