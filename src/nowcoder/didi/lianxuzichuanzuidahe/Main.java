package nowcoder.didi.lianxuzichuanzuidahe;

import java.util.Scanner;
/**
 * �����Ӵ�����
 * @author lenovo
 * ֻ��ҪO��N����ʱ�䡣��Ϊ��� ���������к�ֻ��������λ��0��n-1��ĳ��λ�ý�β��
 * ����������i��Ԫ��ʱ���ж�����ǰ������������к��Ƿ����0��
 * �������0������λ��i��β��������������к�ΪԪ��i��ǰ������������к���ӣ�
 * ��������λ��i��β��������������к�ΪԪ��i��
 */
public class Main {
	public static int maxSubSequence(int a[]) {
		int maxSum = a[0], maxCurrent = a[0];//��ʼ������Ϊa[0]
		for (int i = 1; i < a.length; i++) {
			maxCurrent = maxCurrent <= 0 ? a[i] : maxCurrent + a[i]; //���ǰ��λ��������������к�С�ڵ���0�����Ե�ǰλ��i��β��������������к�Ϊa[i]�������Ե�ǰλ��i��β��������������к�Ϊ��������֮��
			maxSum = maxCurrent > maxSum ? maxCurrent : maxSum; // ����������������к� 
		}
		return maxSum;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] snums = cin.nextLine().split(" ");
			int[] nums = new int[snums.length];
			for (int i = 0; i < snums.length; i++) {
				nums[i] = Integer.parseInt(snums[i]);
			}
			System.out.println(maxSubSequence(nums));
		}
		cin.close();
	}
}
