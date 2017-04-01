package javase.important_object.string.test;

import java.util.Scanner;

/**
 * - A:案例演示
 * 
 * - 需求：模拟登录，给三次机会，并提示还有几次。
 * 
 * - 用户名和密码都是admin
 * 
 * @author Dan
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名：");
			String username = cin.nextLine();
			System.out.println("请输入密码：");
			String password = cin.nextLine();
			if ("admin".equals(username) && "admin".equals(password)) {
				System.out.println("欢迎" + username + "登录");
				break;
			} else {
				if (i == 2) {
					System.out.println("您的错误次数已到，没有机会了");
				} else {
					System.out.println("用户名或密码错误，您还有" + (2-i) + "次机会");
				}
			}
		}
	}
}
