package reflect;

/**
 * ����һ����ʵ�ֵĽӿ�
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
			System.out.println("ʵ�ֵĽӿڣ�" + intes[i].getName());
		}
	}
}
