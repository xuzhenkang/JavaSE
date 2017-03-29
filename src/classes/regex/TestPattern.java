package classes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
	//把一个字符串中的手机号码获取出来，非常有用的
	public static void main(String[] args) {
		String s = "我的手机号码为：18912345678，曾经用过18987654321，还用过18812345678";
		Pattern p = Pattern.compile("1[3578]\\d{9}");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	// Pattern 的实用方法，与业务无关
	private static void howToUsePattern() {
		Pattern p = Pattern.compile("x*y");
		Matcher m = p.matcher("xxxxxxxy");
		boolean b = m.matches();
		System.out.println(b);
	}
}
