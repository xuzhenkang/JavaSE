package nowcoder.didi.lianxuzichuanzuidahe;

import java.util.Scanner;
/**
 * 连续子串最大和
 * @author lenovo
 * 只需要O（N）的时间。因为最大 连续子序列和只可能是以位置0～n-1中某个位置结尾。
 * 当遍历到第i个元素时，判断在它前面的连续子序列和是否大于0，
 * 如果大于0，则以位置i结尾的最大连续子序列和为元素i和前面的连续子序列和相加；
 * 否则，则以位置i结尾的最大连续子序列和为元素i。
 */
public class Main {
	public static int maxSubSequence(int a[]) {
		int maxSum = a[0], maxCurrent = a[0];//初始化最大和为a[0]
		for (int i = 1; i < a.length; i++) {
			maxCurrent = maxCurrent <= 0 ? a[i] : maxCurrent + a[i]; //如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]，否则以当前位置i结尾的最大连续子序列和为它们两者之和
			maxSum = maxCurrent > maxSum ? maxCurrent : maxSum; // 更新最大连续子序列和 
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
