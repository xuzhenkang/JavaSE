package javase.base.data_type_conversion.test;

class Test1_DataTypeConversion {
	public static void main(String[] args) {
		//������:������ĳ����Ƿ������⣬��������⣬��ָ����˵�����ɡ�
		byte b1 = 3;
		byte b2 = 4;
		//byte b3 = b1 + b2;
		/*
		��������
		1,byte��byte(��short,char)���������ʱ�������Ϊint,����int������ӵĽ��Ҳ��int����
		2,b1��b2����������,�����洢��ֵ�Ǳ仯,�ڱ����ʱ���޷��ж���������ֵ,����п��ܻᳬ��byte��ȡֵ��Χ
		*/
		//System.out.println(b3);
		//byte b4 = 3 + 4;			//java�������г����Ż�����
		byte b4 = 7;
		System.out.println(b4);
	}
}
