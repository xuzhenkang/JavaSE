package javase.base.array.double_dimensional_array;
/*
* A:��ά�������
* B:��ά�����ʽ1
	* int[][] arr = new int[3][2]; 
* C:��ά�����ʽ1�Ľ���
* D:ע������
	* a:���¸�ʽҲ���Ա�ʾ��ά����
		* 1:�������� ������[][] = new ��������[m][n];
		* 2:��������[] ������[] = new ��������[m][n];
	* B:ע�����涨�������
	* 
			int x;
			int y;
			int x,y;
			
			int[] x;
			int[] y[];
			
			int[] x,y[];	x��һά����,y�Ƕ�ά����
* E:������ʾ
	* �����ά���飬�����ά�������ƣ�һά�������ƣ�һ��Ԫ��
*/
class Demo1_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		/*
		����һ����ά����
		�����ά��������3��һά����
		ÿ��һά��������2��Ԫ��

		[[I@19bb25a									//��ά����ĵ�ֵַ
		[I@da6bf4									//һά����ĵ�ֵַ
		0											//Ԫ��ֵ
		*/
		System.out.println(arr);					//��ά����
		System.out.println(arr[0]);					//��ά�����еĵ�һ��һά����
		System.out.println(arr[0][0]);				//��ά�����еĵ�һ��һά����ĵ�һ��Ԫ��
	}
}
