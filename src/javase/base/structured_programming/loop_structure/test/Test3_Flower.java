package javase.base.structured_programming.loop_structure.test;
/*
* A:案例演示
	* 需求：在控制台输出所有的”水仙花数”

	* 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	* 举例：153就是一个水仙花数。
	* 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

	分析:
	1,100 - 999
	2,获取每一个位数的值,百位,十位,个位
	3,判断各个位上的立方和是否等于这个数,如果等于打印
*/
class Test3_Flower {
	public static void main(String[] args) {
		for (int i = 100;i <= 999 ;i++ ) {					//获取100到999之间的数
			int ge = i % 10;								//123 % 10 
			int shi = i / 10 % 10;							//12 % 10;
			int bai = i / 10 / 10 % 10;						//1 % 10

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.println(i);
			}
		}
	}
}
