package designpattern.singleton;

/**
 * ����ʽ����ģʽ
 * �ŵ㣺�̰߳�ȫ����Ȼ�ģ�������Ч�ʸߣ���ͬ������飩��
 * ȱ�㣺�����ӳټ���
 * @author lenovo
 *
 */
public class SingletonHungry {
	private static SingletonHungry instance = new SingletonHungry();
	private SingletonHungry() {
	}
	public static SingletonHungry getInstance() {
		return instance;
	}
}
