package javase.base.structured_programming.loop_structure.nest_loop;
/*
* A:������ʾ
	* ���������һ��4��5�е�����(*)ͼ����
	* 
			��ͼ��
				*****
				*****
				*****
				*****
				
			ע�⣺
				System.out.println("*");��System.out.print("*");������
* B:���ۣ�
	* ��ѭ��������������ѭ����������
*/
class Demo1_ForFor {
	public static void main(String[] args) {
		/*for (int i = 1;i <= 3 ;i++ ) {					//��ѭ��
			System.out.println("i = " + i);
			for (int j = 1;j <= 3 ;j++ ) {				//��ѭ��
				System.out.println("j = " + j);
			}
		}*/

		for (int i = 1;i <= 4 ;i++ ) {					//��ѭ��������������
			for (int j = 1;j <= 5 ;j++ ) {				//��ѭ��������������
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*****
*****
*****
*****

*/
