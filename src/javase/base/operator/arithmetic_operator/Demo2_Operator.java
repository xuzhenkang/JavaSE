package javase.base.operator.arithmetic_operator;

class Demo2_Operator {
	/*
	* a:����ʹ�ã�
		* ���ڲ�������ǰ��ͺ���Ч��һ����(�����÷������ǱȽϳ�����)
	* b:��������ʹ�ã�
		* ���ڲ�������ǰ�棬�����������Լ���Ȼ���ٲ������㡣
		* ���ڲ������ĺ��棬�Ȳ������㣬�����������Լ���
	*/
	public static void main(String[] args) {
		//����ʹ��
		/*int a = 3;
		//a++;						//a = a + 1;
		++a;						//a = a + 1;
		System.out.println(a);*/

		//��������ʹ��
		int a = 3;
		int b;

		//b = a++;					//��++�ڱ��������ʱ��,���Ƚ������е�ֵȡ������ֵ����,Ȼ���������1
		b = ++a;					//��++�ڱ���ǰ���ʱ��,���������1,Ȼ���ڽ������ֵ
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
