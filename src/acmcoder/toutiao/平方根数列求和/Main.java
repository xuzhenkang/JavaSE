package acmcoder.toutiao.平方根数列求和;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String line = cin.nextLine();
			String[] nums = line.split(" ");
			double n = Integer.parseInt(nums[0]);
			int m = Integer.parseInt(nums[1]);
			double sum = (m == 0 ? 0 : n);
			while (m-- > 1) {
				n = Math.sqrt(n);
				sum += n;
			}
			System.out.println(String.format("%.2f", sum));
		}
		cin.close();
	}
}
