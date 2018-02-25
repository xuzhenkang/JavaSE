package oj.gettingjob.acmcoder.qunar.word_transfor;

import java.util.Scanner;
/**
 * ȥ�Ķ�2017У԰��Ƹ �����������ʦ ���߿���
����� | 40�� 3/3
���ʱ任
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
��һ�������б�һ����ʼ���ʺ�һ�����յ��ʣ���ʼ������Ҫͨ�������б��𲽱任�����յ��ʣ���任�������̱任·�����ȡ�
�任����ÿ��ֻ�ܱ䶯1����ĸ�����ɽ���λ�ã��磺��abc���cba���ڱ䶯��2����ĸ����ÿ�α任ֻ�ܴӵ����б���ѡȡ��
���磺��ʼ����hot�����յ���dog�������б�[got, dot, god, dog, lot, log]����̱任·��Ϊ[hot,dot,dog]����̱任·������Ϊ3��
ע�������б��а������յ��ʣ���������ʼ���ʣ��б���ÿһ��ʳ������ʼ���ʡ����յ�����ͬ���б��е��ʲ��ظ���������ĸ��ΪСд��

����
�������������У���һ��Ϊ��ʼ���ʣ��ڶ���Ϊ���յ��ʣ�������Ϊ�����б����ʺ͵���֮���Կո�ָ

���
��̱任·�����ȡ�


��������
hot
dog
got dot god dog lot log

�������
3

Hint
Ѱ�����·������㷨��

��ܰ��ʾ
�뾡����ȫ�����Խ���10����ǰ���Գ��򣬷��������ܼ��Ŷ��ύ�����ܲ�ѯ���������� 
��������ԡ���ɱ������
��������ʹ�ñ��ر���������ҳ�治��¼��������
 * @author Dan
 *
 */
public class Main {

	static int diffAt(String a, String b, int diff) {
		int i = diff;
		for (; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int step;
		String begin, end;
		String[] dict;
		while (cin.hasNext()) {
			step = 1;
			begin = cin.nextLine();
			end = cin.nextLine();
			dict = cin.nextLine().split(" ");
			int diffAt = diffAt(begin, end, 0);
			//System.out.println(diffAt);
			while (diffAt != -1) {
				int k = 0;
				for (int i = 0; i < dict.length; i++) {
					String temp = begin.substring(0, diffAt) + end.charAt(diffAt) + begin.substring(diffAt + 1);
					if (temp.equals(dict[i])) {
						begin = temp;
						System.out.println(temp);
						step++;
						k++;
						//System.out.println(step);
					} 
				}
				if (k == 0) {
					diffAt = diffAt(begin, end, diffAt);
				} else diffAt = diffAt(begin, end, 0);
			}
			System.out.println(step);
		}
		cin.close();
	}
	
	/*public static void main(String[] args) {
		String s = "hot", t = "dog";
		int d = getEditDistance(s, t);
		System.out.println(d);
	}

	// ����������Сֵ
	private static int Minimum(int a, int b, int c) {
		int im = a < b ? a : b;
		return im < c ? im : c;
	}

	public static int getEditDistance(String s, String t) {
		int d[][]; // matrix
		int n; // length of s
		int m; // length of t
		int i; // iterates through s
		int j; // iterates through t
		char s_i; // ith character of s
		char t_j; // jth character of t
		int cost; // cost

		// Step 1
		n = s.length();
		m = t.length();
		if (n == 0) {
			return m;
		}
		if (m == 0) {
			return n;
		}
		d = new int[n + 1][m + 1];

		// Step 2
		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}
		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}

		// Step 3
		for (i = 1; i <= n; i++) {
			s_i = s.charAt(i - 1);
			// Step 4
			for (j = 1; j <= m; j++) {
				t_j = t.charAt(j - 1);
				// Step 5
				cost = (s_i == t_j) ? 0 : 1;
				// Step 6
				d[i][j] = Minimum(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + cost);
			}
		}
		// print(d, m, n);
		return d[n][m];
	}

	public static void print(int d[][], int m, int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	
	
	
}
// asdf
// ddff
// asff dffs
//



