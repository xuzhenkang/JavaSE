package reflect;

/**
 * 通过Class实例化其他类的对象
 * 
 * @author lenovo
 *
 */
public class TestPerson1 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person1");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Person1 per = null;
		try {
			per = (Person1) demo.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		per.setName("Rollen");
		per.setAge(20);
		System.out.println(per);
	}
}
