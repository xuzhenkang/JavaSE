package javase.base.structured_programming.selective_structure;
/*
* A:������ʾ
	* ���󣺻�ȡ���������е����ֵ
	* if����Ƕ��ʹ�á�
*/
class Demo6_IfIf {
	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		int c = 30;
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + "�����ֵ");
			}else {
				System.out.println(c + "�����ֵ");
			}

		}else {	//b >= a
			if (b > c) {
				System.out.println(b + "�����ֵ");
			}else {
				System.out.println(c + "�����ֵ");
			}
		}
	}
}
