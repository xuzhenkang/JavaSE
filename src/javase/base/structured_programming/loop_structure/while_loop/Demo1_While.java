package javase.base.structured_programming.loop_structure.while_loop;
/*
* A:ѭ���ṹwhile���ĸ�ʽ��
* 		
		whileѭ���Ļ�����ʽ��
		while(�ж��������) {
			ѭ�������;
		}
		
		������ʽ��
		
		��ʼ�����;
	    while(�ж��������) {
			 ѭ�������;
			 �����������;
		}
* B:ִ�����̣�
	* a:ִ�г�ʼ�����
	* b:ִ���ж��������,���䷵��ֵ��true����false
		* �����true���ͼ���ִ��
		* �����false���ͽ���ѭ��
	* c:ִ��ѭ�������;
	* d:ִ�п����������
	* e:�ص�B������
* C:������ʾ
	* �������ڿ���̨�������1-10
*/
class Demo1_While {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 10) {
			System.out.println("x = " +  x);
			x++;
		}
	}
}
