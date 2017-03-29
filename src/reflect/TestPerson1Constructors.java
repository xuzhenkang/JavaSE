package reflect;

import java.lang.reflect.Constructor;
/**
 * ����������е�ȫ�����캯��
 * @author kang
 *
 */
public class TestPerson1Constructors {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?>[] cons = demo.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			System.out.println("���췽����" + cons[i]);
		}
	}
}
