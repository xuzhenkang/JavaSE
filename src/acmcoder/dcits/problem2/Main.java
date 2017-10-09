package acmcoder.dcits.problem2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static String delete(String str) {
		char[] chs = str.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for (char c : chs) {
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c) + 1);
			}
		}
		Collection<Integer> al = m.values();
		int index = Collections.min(al);
		StringBuilder sb = new StringBuilder("");
		for (char c : chs) {
			if (m.get(c) != index)
				sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String str = cin.nextLine();
			System.out.println(delete(str));
		}
		cin.close();
	}
}
