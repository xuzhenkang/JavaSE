package javase.base.structured_programming.selective_structure;
class Demo1_Switch {
	public static void main(String[] args) {
		/*
		* A:switch���ĸ�ʽ
		*		int x = 10;
				switch(���ʽ) {		//�����������Ϳ��Խ���byte,short,char,int
					  case ֵ1��		//�����������Ϳ��Խ���ö��(JDK1.5)String�ַ���(JDK1.7)
						�����1;
						break;
						case ֵ2��
						�����2;
						break;
						��
						default��	
						�����n+1;
						break;
				}
		 
		* B:switch���ĸ�ʽ����
		* C:������
			* byte������Ϊswitch�ı��ʽ��?
			* long������Ϊswitch�ı��ʽ��?
			* String������Ϊswitch�ı��ʽ��?
		* C:ִ������
			* �ȼ�����ʽ��ֵ
			* Ȼ���case�����ƥ�䣬����о�ִ�ж�Ӧ����䣬����ִ��default���Ƶ����
		*/

		String name = "rose";
		String gender = "��";
		switch (gender) {
		case "��ʿ":
			System.out.println(name + "��һλ" + gender + "ϲ���Է�˯����dota");
		break;
		case "Ůʿ":
			System.out.println(name + "��һλ" + gender + "ϲ����ֹ�������");
		break;
		default:
			System.out.println(name + "��һλ" + gender + "����Լ���ά����ò����");
		break;
		}
	}
}
