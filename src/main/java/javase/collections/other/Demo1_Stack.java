package javase.collections.other;
// 看看这个Stack的源码，你会发现，该Stack继承自Vector，
// 如果你只需要栈的行为，这里使用继承就不合适了，因为这样会产生Vector的其他所有方法的类。
import java.util.Stack;
public class Demo1_Stack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		//stack.get(index);
		//...
	}
}
