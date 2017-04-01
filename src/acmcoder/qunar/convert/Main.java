package acmcoder.qunar.convert;

import java.util.Scanner;

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
