package javase.base.structured_programming.loop_structure.nest_loop;
/*
������������е���״
		*
		**
		***
		****
		*****
*/
class Demo2_ForFor {
	public static void main(String[] args) {
		for (int i = 1;i <= 5 ; i++) {				//��ѭ����������
			for (int j = 1;j <= i ;j++ ) {			//��ѭ����������
				System.out.print("*");
			}
			System.out.println();					//����껻����һ�е�����
		}
	}
}
/*
*
**

*/