package designpattern.singleton;

/**
 * ����ʽ����ģʽ
 * �ŵ㣺�̰߳�ȫ����ͬ������飩�������ӳټ���
 * ȱ�㣺����Ч�ʵͣ���ͬ������飩
 * @author lenovo
 *
 */
public class SingletonLazy {
	private static SingletonLazy instance = null;
	
	private SingletonLazy(){}
	
	public static synchronized SingletonLazy getInstance() {
		if (null == instance) {
			return new SingletonLazy();
		} else return instance;
	}
}
