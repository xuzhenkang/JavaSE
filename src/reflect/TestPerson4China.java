package reflect;

/**
 * 返回一个类实现的接口
 * @author kang
 *
 */
public class TestPerson4China {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?>[] intes = demo.getInterfaces();
		for (int i = 0; i < intes.length; i++) {
			System.out.println("实现的接口：" + intes[i].getName());
		}
	}
}
