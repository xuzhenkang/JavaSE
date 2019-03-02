package reflect;
/**
实例化Class类对象
运行结果：
类名称：reflect.Demo
类名称：reflect.Demo
类名称：reflect.Demo
*/
public class TestDemo2 {
	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		
		try {
			// 一般采用这种方式
			demo1 = Class.forName("reflect.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;
		
		System.out.println("类名称：" + demo1.getName());
		System.out.println("类名称：" + demo2.getName());
		System.out.println("类名称：" + demo3.getName());
	}
}
