package reflect;

/**
 * ��TestPerson1��Ĵ�����ȫ��ͬ��Ψһһ����������demo = Class.forName("reflect.Person2");
 * ��TestPerson1��Ĵ���Ϊ��demo = Class.forName("reflect.Person1");
 * �˳������лᱨ��
java.lang.InstantiationException: reflect.Person2
	at java.lang.Class.newInstance(Unknown Source)
	at reflect.TestPerson2.main(TestPerson2.java:20)
Exception in thread "main" java.lang.NullPointerException
	at reflect.TestPerson2.main(TestPerson2.java:29)
	
ԭ����Person2��û���޲εĹ�������
�����Ժ��ٱ�дʹ��Classʵ����������Ķ����ʱ��һ��Ҫ�Լ������޲εĹ��캯����
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
