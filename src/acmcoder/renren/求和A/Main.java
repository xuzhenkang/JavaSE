package acmcoder.renren.���A;

/**
���˹�˾2017У԰��Ƹ �����ۺ� ���߿���
����� | 30�� 3/3
���A
ʱ�����ƣ�C/C++���� 2000MS���������� 4000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
СB�����ڰ��������У��᲻��ɻ����Ȥ�����������ϵ�һ�����ŷ���ֽ����������������һ֧�ʣ���ֽ����ÿ��������д��һ�������������֡�Ȼ���ֽ��������˺�����룬��ͻȻ���������и�����ֵ�������ĺ;�Ȼ��һ���ġ�СBһ��������һ�㾫������֪�������ж����ַ�ʽ��ֽ��˺�����룬��Ȼʹ�����ߵ���ֵ֮������ȵġ�
���ܰ�����

����
���������ж��飬ÿ��������ݵĵ�һ��Ϊһ������n��1=< n <=100000����Ϊֽ���ϵķ��������ڶ���Ϊn���ո�ָ�����ֵ��ΪСBд�뷽�����ֵ�����е������Ǿ���ֵ������10000��������
���
��ÿ��������ݣ��ڵ��������������ͬ˺����������ʹ������ֽ���е���ֵ֮����ȡ���ֽ��˺������ʱ��ֻ���ط���ı�Ե˺����

��������
3
1 1 1
9
1 5 -6 7 9 -16 0 -2 2
2
0 0
�������
0
3
1
 * @author Dan
 *
 */
import java.util.Scanner;
public class Main {
	private static long getSum(int[] array, int from, int to) {
		long sum = 0;
		for (int i = from; from <= to && i <= to; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();// ֽ���ĸ�����
			int[] a = new int[n]; // ֽ��
			for (int i = 0; i < n; i++) { // ��ʼ��ֽ��
				a[i] = cin.nextInt();
			}
			int count = 0;
			for (int i = 1; i < n; i++) {
				System.out.print("getSum(a, 0, i-1)=" + getSum(a, 0, i-1));
				System.out.println(" getSum(a, i, n-1)=" + getSum(a, i, n-1));
				if (getSum(a, 0, i-1) == getSum(a, i, n-1)) {
					count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
