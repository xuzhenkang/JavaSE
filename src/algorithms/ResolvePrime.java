package algorithms;

/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 
 * 分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成： (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 * 
 * @author Dan
 *
 */
public class ResolvePrime {
	/**
	 * 分解质因数
	 * 
	 * @param num
	 *            待分解的数字
	 * @return 分解后的数字结果
	 */
	public static String resolvePrime(int num) {
		// 定义结果字符串缓存对象，用来保存结果字符
		StringBuffer sb = new StringBuffer(num + "=");
		// 定义最小素数
		int i = 2;
		// 进行辗转相除法
		while (i <= num) {
			// 若num 能整除 i ，则i 是num 的一个因数
			if (num % i == 0) {
				// 将i 保存进sb 且 后面接上 *
				sb.append(i + "*");
				// 同时将 num除以i 的值赋给 num
				num = num / i;
				// 将i重新置为2
				i = 2;
			} else {
				// 若无法整除，则i 自增
				i++;
			}
		}
		// 去除字符串缓存对象最后的一个*，将结果返回
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(resolvePrime(90));
		System.out.println(resolvePrime(134));
		System.out.println(resolvePrime(81));
		System.out.println(resolvePrime(2));
	}
}
