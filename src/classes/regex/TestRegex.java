package classes.regex;

/**
 * ������ʽ
 * @author kang
 *
 */
public class TestRegex {
	public static void main(String[] args) {
		String regex1 = "^[a-zA-Z_](\\w|-)+@(\\w|-)+(.[a-zA-Z0-9_-])+";
		String regex2 = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";// �����ڵ���������ƥ����ʽ
		
		System.out.println("_asd-5@asdfasdfcom".matches(regex1));
		System.out.println("zhangsan-001@gmail.com".matches(regex2));
		
	}
}
