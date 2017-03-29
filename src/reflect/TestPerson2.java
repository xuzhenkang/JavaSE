package reflect;

/**
 * 与TestPerson1类的代码完全相同，唯一一点区别在于demo = Class.forName("reflect.Person2");
 * 而TestPerson1类的代码为：demo = Class.forName("reflect.Person1");
 * 此程序运行会报错：
java.lang.InstantiationException: reflect.Person2
	at java.lang.Class.newInstance(Unknown Source)
	at reflect.TestPerson2.main(TestPerson2.java:20)
Exception in thread "main" java.lang.NullPointerException
	at reflect.TestPerson2.main(TestPerson2.java:29)
	
原因是Person2类没有无参的构造器。
所以以后再编写使用Class实例化其他类的对象的时候，一定要自己定义无参的构造函数。
 * @author lenovo
 *
 */
public class TestPerson2 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person2");
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
