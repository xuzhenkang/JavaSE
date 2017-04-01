package javase.base.structured_programming.loop_structure.test;
/*
* A:������ʾ
	* ����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
	����:
	1,��Ҫ��һ��������¼סˮ�ɻ����ĸ���
	2,��ȡ�����е�3λ��
	3,�ж��Ƿ�����ˮ�ɻ���
	4,�����������,������������
*/
class Test4_FlowerCount {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 100;i <= 999 ;i++ ) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10;

			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
				count ++;													//��������������,������˼��
			}
		}

		System.out.println(count);
	}
}
