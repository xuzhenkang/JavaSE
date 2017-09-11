package designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ֵ���ģʽ��Ч�����
 * 
 * ���Խ����
 * �ٶȣ��ɿ쵽������ö�ٵ���ģʽ>����ʽ����ģʽ>��̬�ڲ��൥��ģʽ>˫�ؼ��������ģʽ>����ʽ����ģʽ
 * 
 * ʹ��ԭ��
 * ��������ռ����Դ�٣�����Ҫ�ӳټ��أ� ö��ʽ���ڶ���ʽ
 * ��������ռ����Դ����Ҫ�ӳټ��أ���̬�ڲ���ʽ��������ʽ
 * ˫�ؼ����ʽ ����JVM�ײ��ڲ�ģ�͵�ԭ��ż����������⣬������ʹ�á�
 * 
 * @author Kang
 *
 */
public class EfficiencyTest {

	public static void main(String[] args) {
		
		int threadNum = 10;
		long begin = System.currentTimeMillis();
		
		CountDownLatch cdl = new CountDownLatch(threadNum);
		
		for (int i = 0; i < threadNum; i++) {
			new Thread() {
				@Override
				public void run() {
					for (int i = 0; i < 10000000; i++) {
//						Object o = SingletonHungry.getInstance(); //���н���� 41
//						Object o = SingletonLazy.getInstance(); // ���н����23389
//						Object o = SingletonDCL.getInstance(); // ���н����175
//						Object o = SingletonSIC.getInstance(); // ���н����54
						SingletonEnum e = SingletonEnum.INSTANCE; // ���н����34
					}
					cdl.countDown();
				}
			}.start();
		}
		try {
			cdl.await();
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
