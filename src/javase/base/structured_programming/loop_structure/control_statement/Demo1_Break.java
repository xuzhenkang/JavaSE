package javase.base.structured_programming.loop_structure.control_statement;
/*
* A:break��ʹ�ó���
	* ֻ����switch��ѭ���� 
*/
class Demo1_Break {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				break;							//����ѭ��
			}

			System.out.println("x = " + x);
		}
	}
}
