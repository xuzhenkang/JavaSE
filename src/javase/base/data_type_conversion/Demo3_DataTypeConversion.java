package javase.base.data_type_conversion;

class Demo3_DataTypeConversion {					//Conversionת��
	public static void main(String[] args) {
		//��������ת��֮��ʽת��

		/*int x = 3;
		byte b = 4;

		x = x + b;

		System.out.println(x);*/

		//��������ת��֮ǿ��ת��
		/*int x = 3;
		byte b = 4;

		b = (byte)(x + b);
		System.out.println(b);*/

		//00000000 00000000 00000000 10000010			130�Ķ�����
		//10000010										-126����
		//00000001										-1����
		//10000001										-126����
		//11111110										-126ԭ��
		byte b = (byte)(126 + 4);
		System.out.println(b);
		//00000000 00000000 00000001 00101100			300�Ķ�����
		//00101100
		byte b2 = (byte)300;
		System.out.println(b2);
	}
}
