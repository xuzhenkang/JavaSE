package reflect;
/**
ʵ����Class�����
���н����
�����ƣ�reflect.Demo
�����ƣ�reflect.Demo
�����ƣ�reflect.Demo
*/
public class TestDemo2 {
	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		
		try {
			// һ��������ַ�ʽ
			demo1 = Class.forName("reflect.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		demo2 = new Demo().getClass();
		demo3 = Demo.class;
		
		System.out.println("�����ƣ�" + demo1.getName());
		System.out.println("�����ƣ�" + demo2.getName());
		System.out.println("�����ƣ�" + demo3.getName());
	}
}
