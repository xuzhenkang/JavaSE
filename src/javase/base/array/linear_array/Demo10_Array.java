package javase.base.array.linear_array;
/*
* A:������ʾ
	* ����Ԫ�ط�ת(���ǰ�Ԫ�ضԵ�)
*/
class Demo10_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		reverseArray(arr);
		print(arr);
	}

	/*
	����Ԫ�ط�ת
	1,��ȷ����ֵ����void
	2,��ȷ�����б�int[] arr
	*/

	public static void reverseArray(int[] arr) {
		for (int i = 0;i < arr.length / 2 ; i++) {
			//arr[0]��arr[arr.length-1-0]����
			//arr[1]��arr[arr.length-1-1]����
			//arr[2]��arr[arr.lentth-1-2]
			//...

			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

	/*
	�������
	1,��ȷ����ֵ����void
	2,��ȷ�����б�int[] arr
	*/

	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {				//���������е�ÿһ��Ԫ��
			System.out.print(arr[i] + " ");					//��ӡ�ڿ���̨
		}
	}
}
