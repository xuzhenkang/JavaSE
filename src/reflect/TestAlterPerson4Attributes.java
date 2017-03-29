package reflect;

import java.lang.reflect.Field;
/**
 * ͨ�������������
 * @author kang
 *
 */
public class TestAlterPerson4Attributes {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<?> demo = null;
		Object obj = null;

		demo = Class.forName("reflect.Person4");
		obj = demo.newInstance();

		Field field = demo.getDeclaredField("sex");
		field.setAccessible(true);// ����privateȨ��
		field.set(obj, "��");
		System.out.println(field.get(obj));
	}
}
