package javase.important_object.string.test;

import java.util.Scanner;

/**
 * - 需求：把字符串反转

    - 举例：键盘录入"abc"

    - 输出结果："cba"
 * @author Dan
 *
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入字符串");
		String line = cin.nextLine();
		char[] arr = line.toCharArray(); // 将字符串转换成字符数组
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s += arr[i];
		}
		System.out.println(s);
	}
}
