package javase.important_object.string.test;

import java.util.Scanner;

/**
 * - A:������ʾ
 * 
 * - ����ģ���¼�������λ��ᣬ����ʾ���м��Ρ�
 * 
 * - �û��������붼��admin
 * 
 * @author Dan
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�������û�����");
			String username = cin.nextLine();
			System.out.println("���������룺");
			String password = cin.nextLine();
			if ("admin".equals(username) && "admin".equals(password)) {
				System.out.println("��ӭ" + username + "��¼");
				break;
			} else {
				if (i == 2) {
					System.out.println("���Ĵ�������ѵ���û�л�����");
				} else {
					System.out.println("�û������������������" + (2-i) + "�λ���");
				}
			}
		}
	}
}
