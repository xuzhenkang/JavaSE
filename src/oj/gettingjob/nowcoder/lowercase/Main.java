package oj.gettingjob.nowcoder.lowercase;

import java.util.Scanner;
/**
 * 华为笔试题
 * @author lenovo
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String line = cin.nextLine();
			line = line.replaceAll("([^a-zA-Z]*)*", "$1");
 			System.out.println(line.toLowerCase());
		}
		cin.close();
	}
}
