package javase.base.array.linear_array;
/*
* A:ջ(����)
	* �洢�ֲ����� 
	�ֲ�����:�����ڷ��������Ϻͷ����еı���
* B:��(����)
	* �洢new�������������� 
* C:������
	* ������󲿷ֽ��� 
* D:���ط�����
	* ��ϵͳ��� 
* E:�Ĵ���
	* ��CPUʹ��
*/
class Demo3_Array {
	public static void main(String[] args) {
		int[] arr = new int[3];						//��̬��ʼ��,����3�������Ŀռ�
		System.out.println(arr);
		arr[0] = 10;
		arr[1] = 20;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
