package javase.test;

public class Test9 {

	// 让if和else中的语句都执行
	/*
	题目如下：
	public class Test9 {
	
		public static void main(String[] args) {
			if (_______________) {
				System.out.print("a");
			} else {
				System.out.print("b");
			}
		}
	
	}
	执行结果为：
	ab
	 */
	public static void main(String[] args) {
		if (args == null || new Test9() {
			{
				Test9.main(null);
			}
		}.equals("abcde")) {
			System.out.print("a");
		} else {
			System.out.print("b");
		}
	}

}
