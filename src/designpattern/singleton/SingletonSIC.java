package designpattern.singleton;

/**
 * ��̬�ڲ��൥��ģʽ��SIC�� Static Inner Class Singleton��
 * �ŵ㣺�̰߳�ȫ������Ч�ʸߡ������ӳټ���
 * ȱ�㣺ûɶȱ�㣡
 * @author lenovo
 *
 */
public class SingletonSIC {
	private static class Inner {
		/*final ���ÿɲ���*/
		private static /*final*/ SingletonSIC instance = new SingletonSIC();
	}
	private SingletonSIC(){}
	
	public static SingletonSIC getInstance() {
		return Inner.instance;
	}
}
