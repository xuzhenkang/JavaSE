package javase.oo.abstractclass;

public class Demo4_Abstract {
	public static void main(String[] args) {
		
	}
}
abstract class Demo1 {
	/*错误：非法的修饰符组合：The abstract method print in type Demo1 can only set a visibility modifier, one of  public or protected*/
	//public static abstract void print();
	/*The abstract method print in type Demo1 can only set a visibility modifier, one of 
 public or protected */
	//public final abstract void print();
	//private abstract void print();
}
/*
- A:面试题1

    - 一个抽象类如果没有抽象方法，可不可以定义为抽象类？如果可以，有什么意义？

    - 可以

    - 这么做目的只有一个，就是不让其他类创建本类对象，交给子类完成
- B:面试题2
    - abstract不能和哪些关键字共存
    abstract 和 static
    - 被abstract修饰的方法没有方法体
    - 被static修饰的可以用类名.方法名，但是类名.方法名调用抽象方法，是没有意义的。
    abstract和final 
    - 被abstract修饰的方法强制子类重写
    - 被final修饰的不让子类重写，所以他俩矛盾
    abstract 和 private
    - 被abstract修饰的方法是为了让子类看到名强制重写
    - 被private 修饰不让子类访问，所以他俩是矛盾的
*/