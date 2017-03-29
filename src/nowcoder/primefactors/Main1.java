package nowcoder.primefactors;

import java.util.*;
/**
 * 提交时间：2016-01-20 语言：Java 运行时间： <1 ms 占用内存：0K 状态：答案正确
 * @author lenovo
 */
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long params = sc.nextLong();
		if (params < 2) {
			sc.close();
			return;
		}
		String result = getResult(params);
		System.out.println(result);
		sc.close();
	}

	public static String getResult(long ulDataInput) {
		StringBuilder str = new StringBuilder();
		int index = 2;
		while (index <= ulDataInput) {
			if (ulDataInput % index == 0) {
				if (index == ulDataInput) {
					str.append(index).append(" ");
					break;
				} else {
					str.append(index).append(" ");
					ulDataInput = ulDataInput / index;
				}
			} else {
				index++;
			}
		}
		return str.toString();
	}
}