package javase.base.array.double_dimensional_array;
/*
* A:��ά�����ʽ3
	* int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}; 
* B:��ά�����ʽ3�Ľ���
* C:������ʾ
	* �����ʽ��������ݣ������ڴ�ͼ
*/
class Demo4_Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}; //����һ����ά����,�����ά������ÿ�������Ŷ�����һ��һά����
		System.out.println(arr);				//[[I@19bb25a,��ά����ĵ�ֵַ
		System.out.println(arr[0]);				//[I@da6bf4,һά����ĵ�ֵַ
		System.out.println(arr[0][0]);			//1,һά�����е�Ԫ��ֵ
	}
}
