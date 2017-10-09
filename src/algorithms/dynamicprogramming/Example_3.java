package algorithms.dynamicprogramming;
/**
 * ��Ŀ����n��̨�ף�һ����ÿ����һ���������������ж���������n��̨�׵ķ�����
 * ������
 * i=1 f(1) = 1
 * i=2 f(2) = 2
 * i>2 f(i)=f(i-1) + f(i-2),����f(i-1)��ʾ�ӵ�i-1��̨����һ������i��̨�ף�f(i-2)��ʾ�ӵ�i-2��̨������������i��̨�ף�
 * �ɴ˿ɵñ����ݹ鷽��s1.
 * @author Dan
 *
 */
public class Example_3 {
	/**
	 * �����ݹ���⡣
	 * ˼·��
	 * i=1 f(1) = 1
	 * i=2 f(2) = 2
	 * i>2 f(i)=f(i-1) + f(i-2),����f(i-1)��ʾ�ӵ�i-1��̨����һ������i��̨�ף�f(i-2)��ʾ�ӵ�i-2��̨������������i��̨�ף�
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
