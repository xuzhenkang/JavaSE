package javase.base.array.linear_array;
/*
* A:������ʾ
	* �������������������������е�ÿһ��Ԫ�ء�
	* ���������:arr.length����ĳ���
	* ������������:arr.length - 1;
*/
class Demo8_Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};

		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		for (int i = 0;i < 5 ;i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		//arr.length �����������ĳ���
		System.out.println(arr.length);
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.println(arr[i]);
		}

		int[] arr2 = {3,4,5};
		print(arr2);
	}

	/*
	����ı���
	1,����ֵ����void
	2,�����б�int[] arr
	*/

	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}
