package javase.important_object.string.test;
/**
 * - A:������ʾ

    - ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������ַ����ֵĴ�����
    - ABCDEabcd123456!@#$%^
 * @author Dan
 *
 */
public class Test3 {
	public static void main(String[] args) {
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int small = 0;
		int num = 0;
		int other = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				big++;
			} else if (c >= 'a' && c <= 'z') {
				small++;
			} else if (c >= '0' && c <= '9'){
				num++;
			} else {
				other++;
			}
		}
	}
}
