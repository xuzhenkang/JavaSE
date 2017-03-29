package reflect.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 为什么要用invoke方法？
 * 主要是为了类反射，这样你可以在不知道具体的类的情况下，根据配置的字符串去调用一个类的方法。在灵活编程的时候非常有用。
 * 很多框架代码都是这样去实现的。但是一般的编程，你是不需要这样做的，因为类都是你自己写的，怎么调用，怎么生成都是清楚的。
 * 
 * @author kang
 *
 */

public class Demo {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StudentDemo sd = new StudentDemo(1, "测试invoke", "未知", "10000", "19920205", "湖南");
		Object[] objs = new Object[] {};
		StringBuilder sb = new StringBuilder();
		sb.append("<Object.XmlString>start</Object.XmlString>");

		for (Method m : sd.getClass().getMethods()) {
			if (m.getName().startsWith("get")) {
				System.out.println(m.getName());
				sb.append("\n<" + m.getName().substring(3) + ">");// subString(3)是为了去掉前面的get
				sb.append(m.invoke(sd, objs));
				sb.append("</" + m.getName().substring(3) + ">");
				System.out.println("---" + m.invoke(sd, objs));
			}
		}
		System.out.println(sb);
	}
}
