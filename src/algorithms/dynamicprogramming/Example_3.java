package algorithms.dynamicprogramming;
/**
 * 题目：有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法？
 * 分析：
 * i=1 f(1) = 1
 * i=2 f(2) = 2
 * i>2 f(i)=f(i-1) + f(i-2),其中f(i-1)表示从第i-1层台阶迈一步到第i层台阶，f(i-2)表示从第i-2层台阶迈两步到第i层台阶，
 * 由此可得暴力递归方法s1.
 * @author Dan
 *
 */
public class Example_3 {
	/**
	 * 暴力递归求解。
	 * 思路：
	 * i=1 f(1) = 1
	 * i=2 f(2) = 2
	 * i>2 f(i)=f(i-1) + f(i-2),其中f(i-1)表示从第i-1层台阶迈一步到第i层台阶，f(i-2)表示从第i-2层台阶迈两步到第i层台阶，
	 * @param n
	 * @return
	 */
	public int s1(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return n;
		}
		return s1(n-1) + s1(n-2);
	}
}
