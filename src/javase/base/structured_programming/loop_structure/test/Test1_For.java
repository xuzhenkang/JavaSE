package javase.base.structured_programming.loop_structure.test;
/*
* A:������ʾ
	* �������ڿ���̨�������1-10
	* �������ڿ���̨�������10-1
* B:ע������
	* a:�ж�����������ۼ򵥻��Ǹ��ӽ����boolean���͡�
	* b:ѭ������������һ����䣬�����ſ���ʡ�ԣ�����Ƕ�����䣬�����Ų���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
	* c:һ����˵����������ž�û�зֺţ��зֺž�û���������
*/
class Test1_For {
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i++ ){
			System.out.println("i = " + i);
		}
		System.out.println("-----------------------");

		for (int i = 10;i >= 1 ;i-- ) {
			System.out.println("i = " + i);
		}
	}
}
