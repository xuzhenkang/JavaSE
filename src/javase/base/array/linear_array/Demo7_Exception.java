package javase.base.array.linear_array;
/*
* A:������ʾ
	* a:ArrayIndexOutOfBoundsException:��������Խ���쳣
		* ԭ��������˲����ڵ�������
	* b:NullPointerException:��ָ���쳣
		* ԭ�������Ѿ�����ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
		* int[] arr = {1,2,3};
		* arr = null;
		* System.out.println(arr[0]);
*/
class Demo7_Exception {
	public static void main(String[] args) {
		int[] arr = new int[5];						//0x0011
		//System.out.println(arr[-1]);				//�����������в����ڵ�����,���������Խ���쳣

		arr = null;
		System.out.println(arr[0]);					//���������ø�ֵΪnull,��ȥ���������е�Ԫ�ؾͻ���ֿ�ָ���쳣
	}
}
