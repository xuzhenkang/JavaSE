package nowcoder.charnum;

import java.util.Scanner;

/**
 * ����Ĵ��� 
 * �ύʱ�䣺2016-01-18 ���ԣ�Java ����ʱ�䣺 <1 ms ռ���ڴ棺0K ״̬������ȷ
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