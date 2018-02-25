package oj.gettingjob.nowcoder.function;

import java.util.Scanner;
//       1 3 1 2 5 4 3 1 9 10
/*i      0 1 1 2 3 4 5 6 7 8  */

/*left   0 0 0*/
/*mid    0 1 1*/
/*right  0 1 2*/
/*maxLen 0 1 3*/
public class Main {
	public static void main(String[] args) {
		int maxLen, left, n, l, r; 
		int[] arr = {};
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = cin.nextInt();
			}
			left = maxLen = 0;
			l = r = -1;
			boolean isIncreace = true;
			for (int i = 0; i < n-1; i++) {
				if (arr[i] > arr[i+1]) {
					isIncreace = false;
				} else if (arr[i] <= arr[i+1] && isIncreace) {
					isIncreace = true;
				} else if (arr[i] <= arr[i+1] && (!isIncreace || i+1 == n-1)) {
					if (maxLen < i - left + 1) {
						maxLen = i - left + 1;
						l = left;
						r = i;
					}
					left = i;
					isIncreace = true;
				}
			}
			System.out.println("" + l + ", " + r);
		}
		cin.close();
	}
}
