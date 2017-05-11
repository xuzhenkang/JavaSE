package datastructure.sort;

public class InsertSorting extends Sorting {
	/**
	 * <h4>ֱ�Ӳ�������</h4>
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
	 * <h4>�۰��������</h4>
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
	public static void binaryInsertSort(int[] arr) {
		int i, j, low, high, m, t;
		for (i = 1; i < arr.length; i++) {
			low = 0; // ÿ���۰���Ҷ�Ҫ��low��Ϊ��0��λ��
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
		// ����
		int incrementNum = arr.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arr.length; i++) {
				// ���в�������
				for (int j = i; j < arr.length - incrementNum; j = j + incrementNum) {
					if (arr[j] > arr[j + incrementNum]) {
						int temple = arr[j];
						arr[j] = arr[j + incrementNum];
						arr[j + incrementNum] = temple;
					}
				}
			}
			// �����µ�����
			incrementNum /= 2;
		}
	}
}
