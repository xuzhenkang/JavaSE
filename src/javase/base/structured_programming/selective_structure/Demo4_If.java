package javase.base.structured_programming.selective_structure;
/*
* A:������ʾ
	* if������Ԫ��������ͬһ��Ч��
* B:������ʾ
	* if������Ԫ�����������
	
	* ��Ԫ�����ʵ�ֵģ������Բ���if���ʵ�֡���֮��������
	
	* ʲôʱ��if���ʵ�ֲ�������Ԫ�Ľ���?
		* ��if�����ƵĲ�����һ���������ʱ��Ͳ��ܡ�
		* Ϊʲô��?��Ϊ��Ԫ�������һ��������������������Ͼ�Ӧ����һ�������������һ�������

*/
class Demo4_If {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z;

		if (x > y) {
			//z = x;
			System.out.println(x + "�����ֵ");
		}else {
			//z = y;
			System.out.println(y + "�����ֵ");
		}

		//System.out.println(z);

		int a = 20;
		int b = 30;

		int c = (a > b)? a : b;
	}
}
