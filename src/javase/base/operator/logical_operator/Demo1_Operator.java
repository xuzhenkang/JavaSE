package javase.base.operator.logical_operator;

class Demo1_Operator {
	public static void main(String[] args) {
		//&,|,^,!
		//int x = 10;
		//5 < x < 15
		//x > 5 & x < 15
		//�߼��� & ����and ��false��false
		int a = 10;
		int b = 20;
		int c = 30;
		/*System.out.println(a < b & b < c);			//true & true = true
		System.out.println(a < b & b > c);				//true & false = false
		System.out.println(a > b & b < c);				//false & true = false
		System.out.println(a > b & b > c);				//false & false = false*/

		//�߼��� ��or ��true��true
		/*System.out.println(a < b | b < c);				//true | true = true
		System.out.println(a < b | b > c);				//true | false = true
		System.out.println(a > b | b < c);				//false | true = true
		System.out.println(a > b | b > c);				//false | flase = false*/

		//�߼���� ^ ������ͬΪfalse,���߲�ͬΪtrue
		/*System.out.println(a < b ^ b < c);				//true | true = false
		System.out.println(a < b ^ b > c);				//true | false = true
		System.out.println(a > b ^ b < c);				//false | true = true
		System.out.println(a > b ^ b > c);				//false | flase = false*/

		//�߼���!
		System.out.println(!true);
		System.out.println(!!true);
	}
}
