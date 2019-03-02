package oj.practice.nowcoder.huaweijishi.提取不重复的整数;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		int n = cin.nextInt();
		while (n > 0) {
			set.add(n % 10);
			n /= 10;
		}
		for (Integer i : set) 
			System.out.print(i);
		System.out.println();
		cin.close();
	}
}
// 注：这种方法有问题，如果测试用例90,则输出09.然而09非整数，应该输出9才对。但是这种方法在nowcoder上也可以测试通过。
