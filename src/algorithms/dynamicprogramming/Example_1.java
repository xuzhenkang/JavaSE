package algorithms.dynamicprogramming;
/**
 * �����������ֵΪ1Ԫ��3Ԫ��5Ԫ��Ӳ������ö�������ٵ�Ӳ�Ҵչ�11Ԫ,�������ö���öӲ�ң�
 * @author lenovo
 * d(i) = min{d(i - vj) + 1} 
 * i - vj >= 0  vj ��ʾ��j��Ӳ�ҵ���ֵ
 */
public class Example_1 {
	public static void main(String[] args) {
		int[] a = {1, 3, 5}, dp = new int[12];
		int sum = 11, cent = 0;
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) dp[i] = i;
		
		for (int i = 1; i <= sum; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= a[j] && dp[i - a[j]] + 1 < dp[i]) {
					dp[i] = dp[i-a[j]] + 1;
				}
			}
		}
		System.out.println(dp[sum]);
	}
}
