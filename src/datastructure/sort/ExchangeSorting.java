package datastructure.sort;

public class ExchangeSorting extends Sorting {
	/**
	 * <h4>ð������</h4>
	 * 
	 * <p>
	 * ���Ӷȷ�����<br/>
	 * <ul>
	 * <li>1) ��������������ִ�д�����n(n-1)/2,ʱ�临�Ӷ�ΪO(n^2)</li>
	 * <li>2) ��������ʱ�临�Ӷ�ΪO(n)</li>
	 * <li>3) �ռ临�Ӷ�ΪO(1)</li>
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
	 * <h4>��������</h4>
	 * 
	 * <p>
	 * ���Ӷȷ�����<br/>
	 * <ul>
	 * <li>1) ������ʱ�临�Ӷ�ΪO(n^2)</li>
	 * <li>2) ��������ʱ�临�Ӷ�ΪO(nlog_2n)</li>
	 * <li>3) �ռ临�Ӷ�ΪO(log_2n)</li>
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
