package classes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
	//��һ���ַ����е��ֻ������ȡ�������ǳ����õ�
	public static void main(String[] args) {
		String s = "�ҵ��ֻ�����Ϊ��18912345678�������ù�18987654321�����ù�18812345678";
		Pattern p = Pattern.compile("1[3578]\\d{9}");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	// Pattern ��ʵ�÷�������ҵ���޹�
	private static void howToUsePattern() {
		Pattern p = Pattern.compile("x*y");
		Matcher m = p.matcher("xxxxxxxy");
		boolean b = m.matches();
		System.out.println(b);
	}
}
