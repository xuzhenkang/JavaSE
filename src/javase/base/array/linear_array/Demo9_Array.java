package javase.base.array.linear_array;
/*
* A:������ʾ
	* �����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
*/
class Demo9_Array {
	public static void main(String[] args) {
		int[] arr = {33,77,22,44,55};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	��ȡ���������ֵ
	1,����ֵ����int
	2,�����б�int[] arr
	*/

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length ;i++ ) {			//������ĵڶ���Ԫ�ؿ�ʼ����
			if (max < arr[i]) {							//���max��¼��ֵС�ڵ������е�Ԫ��
				max = arr[i];							//max��¼ס�ϴ��
			}
		}

		return max;
	}
}
