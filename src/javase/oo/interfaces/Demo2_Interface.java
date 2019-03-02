package javase.oo.interfaces;

public class Demo2_Interface {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.print();
		System.out.println(Inter1.num);
	}
}
interface Inter1 {
	// 接口中的成员变量默认会有这三个关键字 public static final,并且这三个关键字是无序的，谁放谁前面都行
	public static final int num = 10; // 接口中默认的成员变量都是常量
	//public Inter1(); 接口中无构造器
	// 接口中的方法默认有这两个public abstract,也是无序的
	public abstract void print();
}
class Demo1 implements Inter1 {
	public void print() {
		//num = 20;
		System.out.println(num);
	}
}

/**
- A:接口成员特点

    - 成员变量：只能是常量，并且是静态的并公共的。

        - 默认修饰符：public static final

        - 建议：自己动手给出。

    - 构造方法：接口没有构造方法。
- B:案例演示

    - 接口成员特点
 */
