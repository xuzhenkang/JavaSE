package algorithms.basic.递归和动态规划.斐波那契数列问题;

public class Main {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i < n; i++) {
			System.out.print(f2(i) + " ");
		}
	}

	/**
	 * 
	 * 斐波那契数列问题
	 * 暴力递归解法 O(2^n)
	 * @param n
	 * @return
	 */
	public static int f1(int n) {
		if (n < 1) return 0;
		if (n == 1 || n == 2) return 1;
		return f1(n - 1) + f1(n - 2);
	}
	
	/**
	 * 斐波那契数列问题
	 * 暴力递归解法 O(n)
	 * @param n
	 * @return
	 */
	public static int f2(int n) {
		if (n < 1) return 0;
		if (n == 1 || n == 2) return 1;
		int res = 1, pre = 1, tmp = 0;
		for (int i = 3; i <= n; i++) {
			tmp = res;
			res += pre;
			pre = tmp;
		}
		return res;
	}
	
	
	
	
	
}
