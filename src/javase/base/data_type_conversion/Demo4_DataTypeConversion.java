package javase.base.data_type_conversion;

class Demo4_DataTypeConversion {
	public static void main(String[] args) {
		//System.out.println('a' + 1);			//98,��Ϊ��ASCII���,a�ַ���Ӧ����int���͵�97
		//System.out.println((char)('a' + 1));

		System.out.println("hello"+'a'+1);		//�κ�����������+���ַ��������Ӷ�������µ��ַ���
		System.out.println('a'+1+"hello");

		System.out.println(" 5 + 5 = " + (5 + 5));
	}
}
