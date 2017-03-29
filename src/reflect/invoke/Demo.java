package reflect.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ΪʲôҪ��invoke������
 * ��Ҫ��Ϊ���෴�䣬����������ڲ�֪��������������£��������õ��ַ���ȥ����һ����ķ�����������̵�ʱ��ǳ����á�
 * �ܶ��ܴ��붼������ȥʵ�ֵġ�����һ��ı�̣����ǲ���Ҫ�������ģ���Ϊ�඼�����Լ�д�ģ���ô���ã���ô���ɶ�������ġ�
 * 
 * @author kang
 *
 */

public class Demo {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		StudentDemo sd = new StudentDemo(1, "����invoke", "δ֪", "10000", "19920205", "����");
		Object[] objs = new Object[] {};
		StringBuilder sb = new StringBuilder();
		sb.append("<Object.XmlString>start</Object.XmlString>");

		for (Method m : sd.getClass().getMethods()) {
			if (m.getName().startsWith("get")) {
				System.out.println(m.getName());
				sb.append("\n<" + m.getName().substring(3) + ">");// subString(3)��Ϊ��ȥ��ǰ���get
				sb.append(m.invoke(sd, objs));
				sb.append("</" + m.getName().substring(3) + ">");
				System.out.println("---" + m.invoke(sd, objs));
			}
		}
		System.out.println(sb);
	}
}
