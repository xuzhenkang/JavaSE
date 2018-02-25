package oj.practice.nowcoder.huaweijishi.合并表记录;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int key = cin.nextInt();
			int value = cin.nextInt();
			if (map.containsKey(key))
				map.put(key, map.get(key) + value);
			else map.put(key, value);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		cin.close();
	}
}
