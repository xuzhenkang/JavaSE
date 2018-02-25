package oj.gettingjob.acmcoder.toutiao.DAU;

import java.util.HashSet;
import java.util.Scanner;

/**
 * DAU ͳ��
ʱ�����ƣ�C/C++���� 2000MS���������� 4000MS
�ڴ����ƣ�C/C++���� 32768KB���������� 557056KB
��Ŀ������
�ջ�Ծ�û��� (DAU) �Ǻ���һ����Ʒ���ֵ���Ҫָ�ꡣ
��Ҫ��д���򣬸��ݸ�����ĳһ��� N �����ʼ�¼���Ե�����û����� M ����ͳ�ơ�
ÿ���û����ܷ��ʶ�Ρ�
Ϊ�˷��㣬���������� (uid) Ψһ��ʶÿ���û���
����
ÿһ�а���һ�� uid������ 0 ʱ��Ϊ���������
���빲���� N+1 �У�����Ϊ������ġ�
���
һ�����֣�ȥ�غ� uid ������ M��

��������
12933
111111
59220
69433
59220
111111
0
�������
4

Hint
���ݷ�Χ
0 < uid < 2^63
���� 30% �����ݣ�0 < N < 100,000, 0 < M < 100,000
���� 100% �����ݣ�0 < N < 1,000,000, 0 < M < 800,000
 */
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		HashSet<String> stringSet = new HashSet<>();
//        String line = cin.nextLine();
//        while (!line.equals("0")) {
//            stringSet.add(line);
//            line = cin.nextLine();
//        }
        
		String line;
        do {
        	 line = cin.nextLine();
        	 if (!line.equals("0"))
        		 stringSet.add(line);
        } while (!line.equals("0"));
        
        System.out.println(stringSet.size());
        stringSet.clear();
		cin.close();
	}
}
