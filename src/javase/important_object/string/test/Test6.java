package javase.important_object.string.test;

import java.util.Scanner;

/**
 * - ���󣺰��ַ�����ת

    - ����������¼��"abc"

    - ��������"cba"
 * @author Dan
 *
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("�������ַ���");
		String line = cin.nextLine();
		char[] arr = line.toCharArray(); // ���ַ���ת�����ַ�����
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s += arr[i];
		}
		System.out.println(s);
	}
}
