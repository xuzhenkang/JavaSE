package javase.tools.javadoc.usage;

class Demo2_Math {
	public static void main(String[] args) {
		//double d = Math.random();
		//System.out.println(d);
		
		//Math.random()�����ɴ��ڵ���0.0����С��1.0��α�����
		for (int i = 0;i < 10 ;i++ ) {
			System.out.println(Math.random());
		}

		//����1-100�������
		//Math.random()0.0000000 - 0.999999999
		//Math.random() * 100 ====> 0.00000 - 99.999999999
		//(int)(Math.random() * 100) ====> 0 - 99
		//(int)(Math.random() * 100) + 1

		for (int i = 0;i < 10 ;i++ ) {
			System.out.println((int)(Math.random() * 100) + 1);
		}
	}
}
