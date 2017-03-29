package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/**
 * 取得其他类的全部属性，将这些整理在一起，也就是通过class取得一个类的全部框架
 * @author kang
 *
 */
public class TestPersonPerson4All {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("============本类属性============");
		Field[] field = demo.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			Class<?> type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
		}
		
		System.out.println("=============实现的接口或者父类属性============");
		Field[] field1 = demo.getFields();
		for (int j = 0; j < field1.length; j++) {
			int mo = field1[j].getModifiers();
			String priv = Modifier.toString(mo);
			Class<?> type = field1[j].getType();
			System.out.println(priv + " " + type.getName() + " " + field1[j].getName() + ";");
		}
	}
}
