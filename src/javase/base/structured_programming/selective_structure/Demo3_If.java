package javase.base.structured_programming.selective_structure;
/*
* A:if���ĸ�ʽ2
* 
		if(�Ƚϱ��ʽ) {
			�����1;
		}else {
			�����2;
		}
* B:ִ�����̣�
	* ���ȼ���Ƚϱ��ʽ��ֵ�����䷵��ֵ��true����false��
	* �����true����ִ�������1��
	* �����false����ִ�������2��
* C:������ʾ
	* a:��ȡ���������нϴ��ֵ
	* b:�ж�һ����������������ż��,���������������ż��

	* ע�����else������û�бȽϱ��ʽ�ģ�ֻ��if�����С�
*/
class Demo3_If {
	public static void main(String[] args) {
		/*int x = 0;
		if (x == 1) {
			System.out.println("�в�����ӭ��");
		}else {
			System.out.println("Ů������ӭ��");
		}*/
		
		//a:��ȡ���������нϴ��ֵ
		/*int x = 10;
		int y = 20;
		int z;

		if (x > y) {
			z = x;
		}else {
			z = y;
		}

		System.out.println(z);*/
		
		//b:�ж�һ����������������ż��,���������������ż��
		int num = 11;
		if (num % 2 == 0) {
			System.out.println(num + "��һ��ż��");
		}else {
			System.out.println(num + "��һ������");
		}
	}
}
