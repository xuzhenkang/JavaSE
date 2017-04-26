package acmcoder.renren.����;

/**
���˹�˾2017У԰��Ƹ �����ۺ� ���߿���
����� | 20�� 1/3
����
ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
һ�죬С��������һ����ɿ�������n���ҳ��̲�һ������ֳ�ÿ������ͬ���ȵ��ɿ������ָ�ͬ�£�������͵������������֪�����ܾ����ɿ�����ǰ���£������ٷָ�����ָ���ܵõ����ɿ����ĳ����Ƕ��١�
����
�����һ��һ������n(1<=n<=50)����ʾ�ɿ���������
�������ڶ���n������Li(1<=Li<=100000)���ֱ��ʾ��i���ɿ����ĳ��ȡ�
���
���һ��һ����������ʾ�����ٷָ�����ָ���ܵõ����ɿ����ĳ��ȡ�

��������
4
4 22 8 12
�������
2
 */
import java.util.Scanner;

public class Main {

	private static int getMinEle(int[] a) {
		if (a.length < 1) {
			return -1;
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	public static int getMaxCommon(int[] array) {
		int minN = getMinEle(array);
		for (int j = minN; j >= 1; j--) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] % j == 0) {
					count++;
				}
			}
			if (count == array.length) {
				return j;
			}
		}
		return -1;// �����Լ��
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int len = cin.nextInt();
			int[] array = new int[len];
			for (int i = 0; i < len; i++) {
				array[i] = cin.nextInt();
			}
			System.out.println(getMaxCommon(array));
		}
		cin.close();
	}
}
