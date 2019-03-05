package oj.gettingjob.acmcoder.jd.zhandui;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		@SuppressWarnings("unused")
		int n = 0;
		String s = "";
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = Integer.parseInt(cin.nextLine());
			s = cin.nextLine();
			for (int i = 0; i < s.length(); i++) {
				Character c = s.charAt(i);
				if (c >= '0' && c <= '9') {
					int num = Integer.parseInt(c.toString());
					for (int j = i - num; j <= i + num; j++) {
						if (j >= 0 && j < s.length() && s.charAt(j) == 'X') {
							set.add(j);
						}
					}
				}
			}
			System.out.println(set.size());
			set.clear();
		}
		cin.close();
	}
}
