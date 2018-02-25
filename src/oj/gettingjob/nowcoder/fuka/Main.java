package oj.gettingjob.nowcoder.fuka;

import java.util.Scanner;
/**
 * »ªÎª±ÊÊÔÌâ
 * @author lenovo
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] r = new int[5];
		while (cin.hasNext()) {
			String str = cin.next();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					r[i]++;
				}
			}
		}
		cin.close();
		int min = r[0];
		for (int j = 1; j < 5; j++) {
			min = min > r[j] ? r[j] : min;
		}
		System.out.println(min);
	}
	
}
