package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * ͨ��Class�����������еĹ��캯�� ��Ҳ����ͨ�����ַ�ʽͨ��Class����������Ķ���
 * @author lenovo
 *
 */
public class TestPerson3 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("reflect.Person3");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person3 per1 = null;
		Person3 per2 = null;
		Person3 per3 = null;
		Person3 per4 = null;
		
		// ȡ��ȫ���Ĺ�����
		Constructor<?>[] cons = demo.getConstructors();// ע��������������Ĺ���������˳������е����⡣
		
		/***
		 * ����ʹ�����������
		    Constructor cons0 = demo.getConstructor();
            Constructor cons1 = demo.getConstructor(String.class);
            Constructor cons2 = demo.getConstructor(int.class);
            Constructor cons3 = demo.getConstructor(String.class,int.class);
		 */
		
		try {
			/**
			 * ����������һ�����⣬�±����Ӧ�Ĺ�������˳���Ƿ�һ�£���������ó����ۣ���һ�¡�
			 * Ϊɶ�أ������и����Ӹ��������Ĵ𰸣�
			 * javac��JavaԴ��������˳��ѹ������������д��Class�ļ��Ȼ��JVMҲ��˳�����Щ�������ؽ�����
			 * �������getConstructors() / getMethods()Ҳ�������˳��ѽ�����س�����
			 * 
			 * Ҳ����˵��jdk�汾�����⡣�����صĹ����������ǲ�����������˳��ģ�����jdk��������ģ�����û�б�֤˳��
			 * ��֮�����˳����Ҫ��ע���ص�
			 */
			per1 = (Person3) cons[0].newInstance("Rollen", 20);
			per2 = (Person3) cons[1].newInstance(20);
			per3 = (Person3) cons[2].newInstance();
			per4 = (Person3) cons[3].newInstance("Rollen");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}
}


