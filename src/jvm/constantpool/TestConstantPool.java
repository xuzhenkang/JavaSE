package jvm.constantpool;

public class TestConstantPool {
	
	/**
	 * ���γ�����jdk1.7��jdk1.6�����н���ǲ�һ����
	 * jdk1.7���н�����£�
	 * true
	 * false
	 * jdk1.6���н�����£�
	 * false
	 * false
	 * ԭ��
	 * ��jdk1.7��ʼ�������ؾͷ��뵽�ѿռ����ˣ���ǰ���ڷ�������
	 * jdk1.6��intern()��������״��������ַ���ʵ�����Ƶ��������У����صĽ��Ҳ�ǳ������е��ַ��������ã�
	 * ��StringBuffer�������ַ������ڶ����棬���Ա�Ȼ����ͬһ�����ã�����false��
	 * ��jdk1.7�У�intern()�������ٸ���ʵ������������ֻ�����״γ��ֵ�ʵ�������ã�
	 * ���intern()�������ص����ú���StringBuffer�������ַ���ʵ����ͬһ����
	 * Ϊʲôstr2�ȽϷ���false�أ�������Ϊjvm���ڲ��ڼ������ʱ�򣬾��Ѿ���"class"����ַ����ˣ�
	 * ������"�״γ���"��ԭ����˷���false��
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = new StringBuffer("kang").append("k").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuffer("clas").append("s").toString();
		System.out.println(str2.intern() == str2);
	}
}
