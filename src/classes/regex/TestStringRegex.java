package classes.regex;

//需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
//将字符串还原成:“我要学编程”。
public class TestStringRegex {
	public static void main(String[] args) {
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		
		s = s.replaceAll("(\\.)+", "");
		s = s.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
}
// 这个牛逼！记住吧！