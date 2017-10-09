package datastructure.sort;

public class ExchangeSorting extends Sorting {
	/**
	 * <h4>冒泡排序</h4>
	 * 
	 * <p>
	 * 复杂度分析：<br/>
	 * <ul>
	 * <li>1) 最坏情况：基本操作执行次数：n(n-1)/2,时间复杂度为O(n^2)</li>
	 * <li>2) 最好情况：时间复杂度为O(n)</li>
	 * <li>3) 空间复杂度为O(1)</li>
	 * </ul>
	 * </p>
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int temp;
		for (int i = arr.length - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 1; j <= i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if (!flag)
				return;
		}
	}

	/**
	 * <h4>快速排序</h4>
	 * 
	 * <p>
	 * 复杂度分析：<br/>
	 * <ul>
	 * <li>1) 最坏情况：时间复杂度为O(n^2)</li>
	 * <li>2) 最好情况：时间复杂度为O(nlog_2n)</li>
	 * <li>3) 空间复杂度为O(log_2n)</li>
	 * </ul>
	 * </p>
	 * 
	 * @param arr
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] arr, int left, int right) {
		int temp, i = left, j = right;
		if (left < right) {
			temp = arr[left];
			while (i != j) {
				while (i < j && arr[j] > temp)
					j--;
				if (i < j) {
					arr[i] = arr[j];
					i++;
				}
				while (i < j && arr[i] < temp)
					i++;
				if (i < j) {
					arr[j] = arr[i];
					j--;
				}
			}
			arr[i] = temp;
			quickSort(arr, left, i - 1);
			quickSort(arr, i + 1, right);
		}
	}
}
