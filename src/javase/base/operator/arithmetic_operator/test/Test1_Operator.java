package javase.base.operator.arithmetic_operator.test;
class Test1_Operator {
	public static void main(String[] args) {
		//��һ��
		/*int a = 10;
		int b = 10;
		int c = 10;
	
		a = b++;					//a = 10 ,b = 11
		c = --a;					//a = 9, c = 9			
		b = ++a;					//a = 10, b = 10	
		a = c--;					//a = 9, c = 8			
		
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);*/

		//�ڶ���
		/*int x = 4;
		//		4	+	6+	60
		int y = (x++)+(++x)+(x*10);

		System.out.println("x = " + x + ",y = " +  y);*/

		//���������ľ�ᱨ��,Ϊʲô 
		byte b = 10;
		//b++;					//b = (byte)(b + 1)
		//b = b + 1;				//��byte��int���л�������ʱ��,������Ϊint����,����int��ӵĽ������int,��ֵ��byte����ʧ����
		System.out.println("b = " + b);
		
	}
}
