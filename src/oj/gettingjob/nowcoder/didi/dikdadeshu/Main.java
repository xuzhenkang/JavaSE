package oj.gettingjob.nowcoder.didi.dikdadeshu;

import java.util.Scanner;
/**
 * 求第k大的数
 * @author lenovo
 *
 */
public class Main {
	private static int partition(int[] a, int low, int high) {
		int i = a[low], j = a[low];
		while (low != high) {
			while (low < high && a[high] <= j)
				high--;
			a[low] = a[high];

			while (low < high && a[low] >= j)
				low++;
			a[high] = a[low];
		}
		a[low] = i;
		return low;
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pl = partition(a, low, high);
			quickSort(a, low, pl - 1);
			quickSort(a, pl + 1, high);
		}
	}

	public static int findK(int[] a, int low, int high, int k) {
		int temp = partition(a, low, high);
		if (temp == k - 1)
			return a[temp];
		else if (temp > k - 1)
			return findK(a, low, temp - 1, k);
		else
			return findK(a, temp + 1, high, k);
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String[] snums = cin.nextLine().split(" ");
			int[] nums = new int[snums.length];
			for (int i = 0; i < snums.length; i++) {
				nums[i] = Integer.parseInt(snums[i]);
			}
			int k = Integer.parseInt(cin.nextLine());
			System.out.println(findK(nums, 0, nums.length - 1, k));
		}
		cin.close();
	}
}
