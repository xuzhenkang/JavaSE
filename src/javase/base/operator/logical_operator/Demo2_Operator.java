package javase.base.operator.logical_operator;

class Demo2_Operator {
	/*
	&&��&������
	* a:���ս��һ����
	* b:&&���ж�·Ч���������false���ұ߲�ִ�С�

	||��|������
	a:���յĽ����һ��
	b:||���ж�·Ч��,���Ϊtrue,�ұ߲�ִ��
	*/
	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && b < c);				//true && true = true
		System.out.println(a < b && b > c);				//true && false = false
		System.out.println(a > b && b < c);				//false && true = false
		System.out.println(a > b && b > c);				//false && false = false*/

		int x = 3;
		int y = 4;
		//System.out.println((++x == 3) & (++y == 4));	//false & false = false
		//System.out.println("x = " + x);					//x = 4
		//System.out.println("y = " + y);					//y = 5
		System.out.println("---------------------------");
		System.out.println((++x == 3) && (++y == 4));	//false & false = false
		System.out.println("x = " + x);					//x = 4
		System.out.println("y = " + y);					//y = 4
	}
}
