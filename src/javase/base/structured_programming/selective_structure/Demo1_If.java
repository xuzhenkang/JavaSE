package javase.base.structured_programming.selective_structure;
/*
* C:if���ĸ�ʽ1
* 
		if(�Ƚϱ��ʽ) {
			�����;
		}
* D:ִ�����̣�
	* �ȼ���Ƚϱ��ʽ��ֵ�����䷵��ֵ��true����false��
	* �����true����ִ������壻
	* �����false���Ͳ�ִ������壻
*/
class Demo1_If {
	public static void main(String[] args) {
		int age = 17;

		if (age >= 18) {
			System.out.println("�����������վ");
		}

		System.out.println("����");
	}
}
