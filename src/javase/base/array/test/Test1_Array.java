package javase.base.array.test;
/*
* A:������ʾ
	* ���󣺶�ά�������

	* ��ѭ�����Ƶ��Ƕ�ά����ĳ��ȣ���ʵ����һά����ĸ�����
	* ��ѭ�����Ƶ���һά����ĳ��ȡ�

*/
class Test1_Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};

		for (int i = 0;i < arr.length ;i++ ) {			//��ȡ��ÿ����ά�����е�һά����
			for (int j = 0;j < arr[i].length ;j++ ) {	//��ȡÿ��һά�����е�Ԫ��
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}
}
