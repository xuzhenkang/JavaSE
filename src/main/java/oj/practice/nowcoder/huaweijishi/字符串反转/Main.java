package oj.practice.nowcoder.huaweijishi.字符串反转;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		StringBuilder str = new StringBuilder(cin.nextLine());
		System.out.println(str.reverse().toString());
		cin.close();
	}
}
