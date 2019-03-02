package jvm.constantpool;

public class TestConstantPool {
	
	/**
	 * 本段程序在jdk1.7和jdk1.6上运行结果是不一样的
	 * jdk1.7运行结果如下：
	 * true
	 * false
	 * jdk1.6运行结果如下：
	 * false
	 * false
	 * 原因：
	 * 从jdk1.7开始，常量池就放入到堆空间中了，以前是在方法区。
	 * jdk1.6中intern()方法会把首次遇到的字符串实例复制到常量池中，返回的结果也是常量池中的字符串的引用，
	 * 而StringBuffer创建的字符串是在堆上面，所以必然不是同一个引用，返回false。
	 * 在jdk1.7中，intern()方法不再复制实例，常量池中只保存首次出现的实例的引用，
	 * 因此intern()方法返回的引用和由StringBuffer创建的字符串实例是同一个。
	 * 为什么str2比较返回false呢？这是因为jvm中内部在加载类的时候，就已经有"class"这个字符串了，
	 * 不符合"首次出现"的原则，因此返回false。
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = new StringBuffer("kang").append("k").toString();
		System.out.println(str1.intern() == str1);
		
		String str2 = new StringBuffer("clas").append("s").toString();
		System.out.println(str2.intern() == str2);
	}
}
