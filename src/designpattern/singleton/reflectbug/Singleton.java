package designpattern.singleton.reflectbug;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
		/*Ϊ�˷�ֹͨ�������ƽⵥ��ģʽ���ڴ˴������´���*/
		if (instance != null)
			throw new RuntimeException();
	}

	public static Singleton getInstance() {
		return instance;
	}
}
