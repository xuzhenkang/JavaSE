package javase.base.structured_programming.loop_structure.test;
/*
* A:������ʾ
	* �������1-10֮������֮��
* B:ѧ����ϰ
	* �������1-100֮��ż����
	* �������1-100֮��������

	����:1-10���ݵĺ�
	0 + 1
		1 + 2
			3 + 3
				6
				...
*/
class Test2_For {
	public static void main(String[] args) {
		//1-10�ĺ�
		/*int sum = 0;
		for (int i = 1;i <= 10 ;i++ ) {
			sum = sum + i;
		}

		System.out.println("sum = " + sum);*/

		//1-100��ż����
		/*int sum = 0;
		for (int i = 1;i <= 100 ;i++ ) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println("sum = " + sum);*/

		//1-100��������
		int sum = 0;
		for (int i = 1;i <= 100 ;i+=2 ) {
			/*if (i % 2 != 0) {
				sum = sum + i;
			}*/
			sum = sum + i;
		}

		System.out.println("sum = " + sum);
	}
}
