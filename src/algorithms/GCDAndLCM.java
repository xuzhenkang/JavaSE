package algorithms;

/**
 * greatest common divisor(GCD) �����Լ���㷨
 * 
 * lowest common multiple(LCM) ����С�������㷨
 * @author Dan
 *
 */
public class GCDAndLCM {
	
	public static void main(String[] args) {
		int m = 2, n = 3;
		System.out.println(maxCommonDivisor(m, n));
		System.out.println(maxCommonDivisor2(m, n));
		System.out.println(minCommonMultiple(m, n));
	}
	
	// �ݹ鷨�����Լ��
	public static int maxCommonDivisor(int m, int n) {
		if (m < n) {// ��֤m>n,��m<n,��������ݽ���
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0) {// ������Ϊ0,�������Լ��
			return n;
		} else { // ����,���еݹ�,��n����m,����������n
			return maxCommonDivisor(n, m % n);
		}
	}

	// ѭ���������Լ��
	public static int maxCommonDivisor2(int m, int n) {

		if (m < n) {// ��֤m>n,��m<n,��������ݽ���
			int temp = m;
			m = n;
			n = temp;
		}
		while (m % n != 0) {// ����������Ϊ0ʱ,����ѭ��
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;// �������Լ��
	}
	// ����С������  
    public static int minCommonMultiple(int m, int n) {  
        return m * n / maxCommonDivisor(m, n);  
    } 
}
