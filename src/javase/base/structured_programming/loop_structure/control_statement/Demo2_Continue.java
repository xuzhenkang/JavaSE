package javase.base.structured_programming.loop_structure.control_statement;
/*
* A:continue��ʹ�ó���
	* ֻ����ѭ���� 
*/
class Demo2_Continue {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				continue;							//��ֹ����ѭ��,�����´�ѭ��
			}

			System.out.println("x = " + x);
		}
	}
}
