package javase.base.structured_programming.loop_structure.do_while_loop;
/*
* A:ѭ���ṹdo...while���ĸ�ʽ��
* 
		do {
			ѭ�������;
		}while(�ж��������);
		
		������ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
* B:ִ�����̣�
	* a:ִ�г�ʼ�����
	* b:ִ��ѭ�������;
	* c:ִ�п����������
	* d:ִ���ж��������,���䷵��ֵ��true����false
		* �����true���ͼ���ִ��
		* �����false���ͽ���ѭ��
	* e:�ص�b������
* C:������ʾ
	* �������ڿ���̨�������1-10
*/
class Demo1_DoWhile {
	public static void main(String[] args) {
		//while ��do while������
		/*int i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		}
		while (i <= 10);
		
		System.out.println("---------------------");

		int j = 11;
		while (j <= 10) {
			System.out.println("j = " + j);
			j++;
		}*/

		/*for (int i = 1;i <= 10 ;i++ ) {
			System.out.println("i = " + i);
		}

		//System.out.println("i = " + i);			for���ִ�к�����ᱻ�ͷ�,������ʹ��
		System.out.println("-------------------");
		int i = 1;
		while (i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("-------------------");
		System.out.println("i = " + i);				//while���ִ�к�,��ʼ�����������Լ���ʹ��*/

		//while��������ѭ��
		/*while (true) {
			System.out.println("hello world");
		}*/

		//System.out.println("hello world");
		//for��������ѭ��
		for (; ; ) {
			System.out.println("hello world");
		}
	}
}
