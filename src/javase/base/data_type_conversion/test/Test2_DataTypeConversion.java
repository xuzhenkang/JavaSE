package javase.base.data_type_conversion.test;

class Test2_DataTypeConversion {
	public static void main(String[] args) {
		float f = 12.3f;
		long x = 12345;

		//f = x;						//��ʽת��
		//System.out.println(f);

		x = (long)f;					//ǿ��ת��
		System.out.println(x);

		/*
		floatռ4���ֽ�
		IEEE 754
		32��������λ
		1λ�����Ƿ���λ
		8λ����ָ��λ
		00000000 - 11111111
		0 - 255
		0����0
		255���������
		1 - 254

		-126 - 127
		23λ����β��λ
		*/
	}
}
