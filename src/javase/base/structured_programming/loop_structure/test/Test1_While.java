package javase.base.structured_programming.loop_structure.test;
class Test1_While {
	public static void main(String[] args) {
		/*
		* A:���˼��
			* ��1-100֮��
		* B:ͳ��˼��
			* ͳ�ơ�ˮ�ɻ��������ж��ٸ�
		*/
		
		//��1-100֮��
		/*int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;					//sum = sum + i;
			i++;						//�ñ���i����
		}

		System.out.println("sum = " + sum);*/

		//ͳ�ơ�ˮ�ɻ��������ж��ٸ�
		int count = 0;					//������
		int i = 100;
		while (i <= 999) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;

			if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
				count ++;
			}

			i++;
		}

		System.out.println("count =" + count);

		//ĳ��˿Ϊ��׷��Ů��,д��һ�δ���ʾ��,����Ů��Ҳ��java,�Ķ�һ�°ь�˿�ܾ�
		int j = 1;
		while (j <= 10000) {
			System.out.println("I Love You!!!");
			j++;
		}
	}
}
