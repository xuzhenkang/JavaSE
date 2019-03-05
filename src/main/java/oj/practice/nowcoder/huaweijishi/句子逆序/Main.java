package oj.practice.nowcoder.huaweijishi.句子逆序;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String sentence = cin.nextLine();
		System.out.println(new Main().reverse(sentence));
		cin.close();
	}
	public String reverse(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder strbuldr = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			strbuldr.append(words[i]).append(" ");
		}
		return strbuldr.toString().trim();
	}
}
