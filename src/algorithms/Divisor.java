package algorithms;
// 求n个整数的最大公约数
public class Divisor {

	public int getMaxDivisor(int[] array) {
		int minN = getMin(array);
		for (int j = minN; j >= 2; j--) {
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
		return -1;// 无最大公约数
	}

	public int getMin(int[] a) {
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
}