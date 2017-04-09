package algorithms;

/**
 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 * 
 * ��������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
 * (2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
 * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
 * 
 * @author Dan
 *
 */
public class ResolvePrime {
	/**
	 * �ֽ�������
	 * 
	 * @param num
	 *            ���ֽ������
	 * @return �ֽ������ֽ��
	 */
	public static String resolvePrime(int num) {
		// �������ַ���������������������ַ�
		StringBuffer sb = new StringBuffer(num + "=");
		// ������С����
		int i = 2;
		// ����շת�����
		while (i <= num) {
			// ��num ������ i ����i ��num ��һ������
			if (num % i == 0) {
				// ��i �����sb �� ������� *
				sb.append(i + "*");
				// ͬʱ�� num����i ��ֵ���� num
				num = num / i;
				// ��i������Ϊ2
				i = 2;
			} else {
				// ���޷���������i ����
				i++;
			}
		}
		// ȥ���ַ��������������һ��*�����������
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(resolvePrime(90));
		System.out.println(resolvePrime(134));
		System.out.println(resolvePrime(81));
		System.out.println(resolvePrime(2));
	}
}
