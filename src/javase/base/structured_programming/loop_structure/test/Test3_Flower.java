package javase.base.structured_programming.loop_structure.test;
/*
* A:������ʾ
	* �����ڿ���̨������еġ�ˮ�ɻ�����

	* ��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
	* ������153����һ��ˮ�ɻ�����
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	����:
	1,100 - 999
	2,��ȡÿһ��λ����ֵ,��λ,ʮλ,��λ
	3,�жϸ���λ�ϵ��������Ƿ���������,������ڴ�ӡ
*/
class Test3_Flower {
	public static void main(String[] args) {
		for (int i = 100;i <= 999 ;i++ ) {					//��ȡ100��999֮�����
			int ge = i % 10;								//123 % 10 
			int shi = i / 10 % 10;							//12 % 10;
			int bai = i / 10 / 10 % 10;						//1 % 10

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.println(i);
			}
		}
	}
}
