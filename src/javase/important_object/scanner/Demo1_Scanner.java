package javase.important_object.scanner;

import java.util.Scanner;
/**
 * - A:Scanner�ĸ���
- B:Scanner�Ĺ��췽��ԭ��
    - Scanner(InputStream source)
    - System������һ����̬���ֶΣ�
        - public static final InputStream in; ��׼������������Ӧ�ż���¼��
- C:һ�㷽��
    - hasNextXxx() �ж��Ƿ�����һ�����������Xxx������Int��Double�ȡ������Ҫ�ж��Ƿ������һ���ַ����������ʡ��Xxx
    - nextXxx() ��ȡ��һ�������Xxx�ĺ�����ϸ������е�Xxx��ͬ��Ĭ������£�Scannerʹ�ÿո񣬻س�����Ϊ�ָ���
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
			System.out.println("��������ʹ���");
		}
	}
}
