package oj.practice.nowcoder.huaweijishi.��ȡ���ظ�������;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		int n = cin.nextInt();
		while (n > 0) {
			set.add(n % 10);
			n /= 10;
		}
		for (Integer i : set) 
			System.out.print(i);
		System.out.println();
		cin.close();
	}
}
// ע�����ַ��������⣬�����������90,�����09.Ȼ��09��������Ӧ�����9�Ŷԡ��������ַ�����nowcoder��Ҳ���Բ���ͨ����
