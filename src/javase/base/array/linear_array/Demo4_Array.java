package javase.base.array.linear_array;
class Demo4_Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];				//��������,����Ϊ3
		int[] arr2 = new int[3];				//��������,����Ϊ3

		System.out.println(arr1);				//��ӡ����ĵ�ֵַ
		System.out.println(arr2);

		arr1[0] = 10;							//����һ�������е�һ��Ԫ�ظ�ֵ
		arr2[1] = 20;							//���ڶ��������еڶ���Ԫ�ظ�ֵ

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("--------------------------------------");

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}
