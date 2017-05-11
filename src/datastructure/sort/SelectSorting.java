package datastructure.sort;

public class SelectSorting extends Sorting {
	/**
	 * <h4>ѡ������</h4>
	 * 
	 * <p>
	 * ���Ӷȷ�����<br/>
	 * <ul>
	 * <li> ��������ִ�д�����n(n-1)/2,ʱ�临�Ӷ�ΪO(n^2)</li>
	 * <li> �ռ临�Ӷ�ΪO(1)</li>
	 * </ul>
	 * </p>
	 * 
	 * @param arr
	 */
	public static void simpleSelectSort(int[] arr) {
		int i, j, minIndex, t; // minIndex����СԪ�ص��±�
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
		for (int i = arr.length / 2 - 1; i >= 0; i--) { // ������
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
		int i = low, j = 2 * (i + 1) - 1; // j�������
		int t = arr[low]; // low��Ҫ������λ�ã���t��¼��ֵ,t�Ǹ��ڵ�
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
