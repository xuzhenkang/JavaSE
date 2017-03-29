package nowcoder.charnum;

import java.util.Scanner;

/**
 * 大神的代码 
 * 提交时间：2016-01-18 语言：Java 运行时间： <1 ms 占用内存：0K 状态：答案正确
 * 
 * @author lenovo
 *
 */
public class Main1 {
	public static int getCount(String str, char c) {
		int count = 0;
		if (str != null && str.length() > 0) {
			for (int i = 0; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					count++;
				}
			}
		} else {
			count = 0;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char c = s.next().charAt(0);
		int i = getCount(str, c);
		System.out.println(i);
	}
}