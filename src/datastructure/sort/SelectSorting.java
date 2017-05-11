package datastructure.sort;

public class SelectSorting extends Sorting {
	/**
	 * <h4>选择排序</h4>
	 * 
	 * <p>
	 * 复杂度分析：<br/>
	 * <ul>
	 * <li> 基本操作执行次数：n(n-1)/2,时间复杂度为O(n^2)</li>
	 * <li> 空间复杂度为O(1)</li>
	 * </ul>
	 * </p>
	 * 
	 * @param arr
	 */
	public static void simpleSelectSort(int[] arr) {
		int i, j, minIndex, t; // minIndex是最小元素的下标
		for (i = 0; i < arr.length; i++) {
			minIndex = i;
			for (j = i+1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			t = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = t;
		}
	}
	
	public static void heapSort(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) { // 创建堆
			sift(arr, i, arr.length - 1);
		}
		for (int i = arr.length - 1; i >= 1; i--) {
			int t = arr[0];
			arr[0] = arr[i];
			arr[i] = t;
			sift(arr, 0, i - 1);
		}
	}
	private static void sift(int[] arr, int low, int high) {
		int i = low, j = 2 * (i + 1) - 1; // j是左儿子
		int t = arr[low]; // low是要调整的位置，用t记录该值,t是父节点
		while (j <= high) {
			if (j < high && arr[j] < arr[j + 1]) 
				j++;
			if (t < arr[j]) {
				arr[i] = arr[j];
				i = j;
				j = 2 * (i + 1) - 1;
			} else break;
		}
		arr[i] = t;
	}
}
