package javase.important_object.scanner;

import java.util.Scanner;
/**
 * - A:Scanner的概述
- B:Scanner的构造方法原理
    - Scanner(InputStream source)
    - System类下有一个静态的字段：
        - public static final InputStream in; 标准的输入流，对应着键盘录入
- C:一般方法
    - hasNextXxx() 判断是否还有下一个输入项，其中Xxx可以试Int，Double等。如果需要判断是否包含下一个字符串，则可以省略Xxx
    - nextXxx() 获取下一个输入项。Xxx的含义和上个方法中的Xxx相同，默认情况下，Scanner使用空格，回车等作为分隔符
 * @author Dan
 *
 */
public class Demo1_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int i = sc.nextInt();
		System.out.println(i);*/
		if (sc.hasNext()) {
			int i = sc.nextInt();
			System.out.println(i);
		} else {
			System.out.println("输入的类型错误");
		}
	}
}
