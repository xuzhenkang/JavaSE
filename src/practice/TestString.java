package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 实现在文本中查找的功能
public class TestString {
	public static void main(String[] args) {
		String s = "asdfasdfdd中国sdfafedf中国awgvcva中国dfasfd";
		String p = "中国";
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.start() + ","+ matcher.end());
		}
	}
}
