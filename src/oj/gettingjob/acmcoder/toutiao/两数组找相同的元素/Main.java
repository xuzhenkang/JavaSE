package oj.gettingjob.acmcoder.toutiao.����������ͬ��Ԫ��;

/**
 * ����������ͬ��Ԫ��-array
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
����������(int)���飬�����ͬ��Ԫ�ء�
����
����������������[a1, a2, ...., am]��[b1, b2, ..., bn]
�����ʽ���£���һ�и�����һ������Ĵ�Сm����������m��Ϊ������Ԫ��a1 -- am��ÿ��һ��Ԫ�أ���m+1��Ϊ�ڶ�������Ĵ�Сn����������n��Ϊ������Ԫ��b1 -- bn��Ҳ��ÿ��һ��Ԫ�ء�ʾ�����£�
m
a1
a2
��
am
n
b1
b2
��
bn

���
������������ͬ��Ԫ�أ��Կո�ָ���һ������ʾ����ʾ˳��Ϊ���ڵڶ��������г��ֵ�˳��

��������
5
11
15
9
12
3
4
11
3
9
7
�������
11 3 9
 * @author Dan
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int[] am = new int[m];
			for (int i = 0; i < m; i++) {
				am[i] = cin.nextInt();
			}
			int n = cin.nextInt();
			int[] an = new int[n];
			for (int i = 0; i < n; i++) {
				an[i] = cin.nextInt();
			}
			ArrayList<Integer> arrayList = contains(am, an);
			for (int i : arrayList) {
				System.out.print(i + " ");
			}
		}
		cin.close();
	}

	public static ArrayList<Integer> contains(int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					result.add(b[i]);
					break;
				}
			}
		}
		return result;
	}
}
