package javase.tools.javadoc.usage;

class Demo3_Static {
	public static void main(String[] args) {
		//method();								//����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� method()
		Demo3_Static.print();					//���������е��ñ���ľ�̬����,����ʡ������.,ϵͳ��Ĭ�ϼ���
		Demo3_Static d = new Demo3_Static();	//�Ǿ�̬�����ڵ��õ�ʱ����봴���������
		d.method();
	}

	public void method() {					
		System.out.println("Hello World!");		
	}

	public static void print() {
		System.out.println("Hello World!");
	}
}
