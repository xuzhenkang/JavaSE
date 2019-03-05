package reflect;
/**
 * 取得其他类中的父类
 * @author lenovo
 *
 */
public class TestPerson1Super {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?> temp = demo.getSuperclass();
		System.out.println("继承的父类为：" + temp.getName());
	}
}
