package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ʵ�����ı��в��ҵĹ���
public class TestString {
	public static void main(String[] args) {
		String s = "asdfasdfdd�й�sdfafedf�й�awgvcva�й�dfasfd";
		String p = "�й�";
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.start() + ","+ matcher.end());
		}
	}
}
