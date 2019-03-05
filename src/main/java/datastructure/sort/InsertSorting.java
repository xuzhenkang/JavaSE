package datastructure.sort;

public class InsertSorting extends Sorting {
	/**
	 * <h4>直接插入排序</h4>
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
	public static void straightInsertSort(int[] arr) {
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	/**
	 * <h4>折半插入排序</h4>
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
	public static void binaryInsertSort(int[] arr) {
		int i, j, low, high, m, t;
		for (i = 1; i < arr.length; i++) {
			low = 0; // 每次折半查找都要将low置为第0个位置
			t = arr[i];
			high = i - 1;
			while (low <= high) {
				m = (low + high) / 2;
				if (arr[m] > t)
					high = m - 1;
				else
					low = m + 1;
			}
			for (j = i - 1; j >= low; --j)
				arr[j + 1] = arr[j];
			arr[j + 1] = t;
		}
	}

	public static void shellSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		// 增量
		int incrementNum = arr.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arr.length; i++) {
				// 进行插入排序
				for (int j = i; j < arr.length - incrementNum; j = j + incrementNum) {
					if (arr[j] > arr[j + incrementNum]) {
						int temple = arr[j];
						arr[j] = arr[j + incrementNum];
						arr[j + incrementNum] = temple;
					}
				}
			}
			// 设置新的增量
			incrementNum /= 2;
		}
	}
}
