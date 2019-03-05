package javase.base.operator.arithmetic_operator;

class Demo1_Operator {						//operator 运算符
	public static void main(String[] args) {
		/*
		* a:+号在java中有三种作用,代表正号,做加法运算,字符串的连接符
		* b:整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
		* c:/获取的是除法操作的商，%获取的是除法操作的余数
		* %运算符
			* 当左边的绝对值小于右边绝对值时,结果是左边
			* 当左边的绝对值等于右边或是右边的倍数时,结果是0
			* 当左边的绝对值大于右边绝对值时,结果是余数
			* %运算符结果的符号只和左边有关系,与右边无关
			* 任何一个正整数%2结果不是0就是1可以用来当作切换条件 
		*/

		//System.out.println(10 / 3);				//整数相除结果只能是整数
		//System.out.println(10 / 3.0);			//如果想得到小数,把其中一个数变成小数,另一个数在运算的时候会自动类型提升
		//System.out.println(-5 % 5);
		System.out.println(13 % -5);
	}
}
