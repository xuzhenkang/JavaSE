package oj.gettingjob.nowcoder.ofo.problem2;

import java.util.Scanner;

public class Main {
	public static long opera(long number) {
		if (number == 1) {
			return 0;
		}
		if (number % 2 == 0) {
			return 1 + opera(number / 2);
		}
		long x = opera(number + 1);
		long y = opera(number - 1);
		if (x > y) {
			return y + 1;
		} else
			return x + 1;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long number = cin.nextLong();
		System.out.println(opera(number));
		cin.close();
	}
}
