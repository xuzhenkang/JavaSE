package javase.base.structured_programming.selective_structure;
/*
* A:if���ĸ�ʽ3��
* 
		if(�Ƚϱ��ʽ1) {
			�����1;
		}else if(�Ƚϱ��ʽ2) {
			�����2;
		}else if(�Ƚϱ��ʽ3) {
			�����3;
		}
		...
		else {
			�����n+1;
		}
* B:ִ�����̣�
	* ���ȼ���Ƚϱ��ʽ1���䷵��ֵ��true����false��
	* �����true����ִ�������1��if��������
	* �����false�����ż���Ƚϱ��ʽ2���䷵��ֵ��true����false��
	
	* �����true����ִ�������2��if��������
	* �����false�����ż���Ƚϱ��ʽ3���䷵��ֵ��true����false��
	
	* �������false����ִ�������n+1��
* C:ע������:���һ��else����ʡ��,���ǽ��鲻Ҫʡ��,���ԶԷ�Χ��Ĵ���ֵ��ʾ 
*/
class Demo5_If {
	public static void main(String[] args) {
		int x = 2;
		if (x == 1) {
			System.out.println("�в�����ӭ��");
		}else if (x == 0) {
			System.out.println("Ů������ӭ��");
		}else {
			System.out.println("�޷�ʶ�������Ա�");
		}
	}
}
