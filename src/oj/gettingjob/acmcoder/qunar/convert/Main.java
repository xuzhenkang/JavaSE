package oj.gettingjob.acmcoder.qunar.convert;

import java.util.Scanner;
/**
 * ȥ�Ķ�2017У԰��Ƹ �����������ʦ ���߿���
����� | 30�� 2/3
����ת��
ʱ�����ƣ�C/C++���� 2000MS���������� 4000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
��Ӣ����ĸa-z���ֱ��ʾ��ֵ0-25, �γ�һ��26���Ƶ���ֵ��ʾ������Ҫ��дһ������������a-z��ʾ��26������ֵ���ַ�����ת��Ϊ��Ӧ��10������ֵ��

����
���������ж��飬ÿ��ռһ�У��������a-z֮����ַ���

���
����Ӧ��ʾ��10��������


��������
ba
bcd
gibbon
goodboy

�������
26
731
74962693
2026285376


Hint
������ת���߼���
��ܰ��ʾ
�뾡����ȫ�����Խ���10����ǰ���Գ��򣬷��������ܼ��Ŷ��ύ�����ܲ�ѯ���������� 
��������ԡ���ɱ������
��������ʹ�ñ��ر���������ҳ�治��¼��������
 * @author Dan
 *
 */
public class Main {
	public static long solve(String s) {
		long result = 0L;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + s.charAt(i) - 'a';
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			System.out.println(solve(cin.nextLine()));
		}
		cin.close();
	}
}
