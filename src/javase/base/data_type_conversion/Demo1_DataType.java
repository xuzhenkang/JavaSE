package javase.base.data_type_conversion;

class Demo1_DataType {							//DataType��������			
	public static void main(String[] args) {
		//��������
		byte b = 10;			//ռһ���ֽ�,-128 �� 127
		short s = 20;			//ռ�����ֽ�
		int i = 30;				//ռ�ĸ��ֽ�			����Ĭ�ϵ��������;���int����
		long x = 8888888888L;	//ռ�˸��ֽ�	���long���ͺ����L���б�ʶ��üӴ�L,��ΪСl̫��һ��
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);

		//System.out.println(12345 + 54321l);

		//��������
		float f = 12.3F;		//ռ�ĸ��ֽ�
		double d = 33.4;		//ռ�˸��ֽ�			С��Ĭ�ϵ�����������double,double���ͺ���Ҳ������D��d��ʶ,����һ�㲻��
		System.out.println(f);
		System.out.println(d);

		//�ַ�����
		char c = 'a';			//ռ�����ֽ�
		System.out.println(c);

		//��������
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
