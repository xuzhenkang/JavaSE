package javase.tools.javadoc.usage;

/**
����һ�����鹤����,�����װ�˲����������ֵ,��ӡ����,���鷴ת�ķ���
@author fengjia
@version v1.0
*/
public class ArrayTool {
	//���һ���������еķ������Ǿ�̬��,��Ҫ�ٶ���һ��,˽�й��췽��,Ŀ���ǲ��������ഴ���������
	//ֱ��������.���ü���
	/**
	˽�й��췽��
	*/
	private ArrayTool(){}

	//1,��ȡ���ֵ

	/**
	���ǻ�ȡ���������ֵ�ķ���
	@param arr ����һ��int��������
	@return �������������ֵ
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];						//��¼��һ��Ԫ��
		for (int i = 1;i < arr.length ;i++ ) {	//�ӵڶ���Ԫ�ؿ�ʼ����
			if (max < arr[i]) {					//max��������������Ԫ�رȽ�
				max = arr[i];					//��¼ס�ϴ��
			}
		}

		return max;								//�����ֵ����
	}
	//2,����ı���
	/**
	���Ǳ�������ķ���
	@param arr ����һ��int��������
	*/
	public static void print(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {	//��������
			System.out.print(arr[i] + " ");
		}
	}
	//3,����ķ�ת
	/**
	�������鷴ת�ķ���
	@param arr ����һ��int��������
	*/
	public static void revArray(int[] arr) {
		for (int i = 0;i < arr.length / 2 ;i++ ) {	//ѭ��������Ԫ�ظ�����һ��
			/*
			arr[0]��arr[arr.length-1-0]	����
			arr[1]��arr[arr.length-1-1]	����
			arr[2]��arr[arr.length-1-2] ����
			*/
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}
