package javase.base.array.double_dimensional_array;
/*
* A:��ά�����ʽ2
	* int[][] arr = new int[3][]; 
* B:��ά�����ʽ2�Ľ���
* C:������ʾ
	* �����ʽ��������ݣ������ڴ�ͼ
*/
class Demo3_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][];				//����һ����ά����,�����ά������������һά����,����һά���鶼û�б���ֵ
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[3];					//��һ��һά�����п��Դ洢����intֵ
		arr[1] = new int[5];					//�ڶ���һά�����п��Դ洢���intֵ
		System.out.println("------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
